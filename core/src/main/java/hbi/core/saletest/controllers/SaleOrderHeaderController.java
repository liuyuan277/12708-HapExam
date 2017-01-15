package hbi.core.saletest.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.exception.TokenException;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.saletest.dto.SaleOrderHeader;
import hbi.core.saletest.service.ISaleOrderHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/orderHeader")
public class SaleOrderHeaderController extends BaseController {

    @Autowired
    ISaleOrderHeaderService saleOrderHeaderService;

    public SaleOrderHeaderController() {
    }

    @RequestMapping({"/query"})
    public ResponseData getPosition(HttpServletRequest request, SaleOrderHeader saleOrderHeader, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int pagesize) {
        IRequest iRequest = this.createRequestContext(request);
        return new ResponseData(this.saleOrderHeaderService.selectOrderHeader(iRequest, saleOrderHeader, page, pagesize));
    }

    @RequestMapping(
            value = {"/submit"},
            method = {RequestMethod.POST}
    )
    public ResponseData submitPosition(@RequestBody List<SaleOrderHeader> saleOrderHeader, HttpServletRequest request) {
            IRequest requestCtx = this.createRequestContext(request);
            return new ResponseData(this.saleOrderHeaderService.batchUpdate(requestCtx, saleOrderHeader));

    }
//    @RequestMapping(
//            value = {"/submit"},
//            method = {RequestMethod.POST}
//    )
//    public ResponseData submitPosition(@RequestBody List<SaleOrderHeader> saleOrderHeader, BindingResult result, HttpServletRequest request) throws TokenException {
//        this.checkToken(request, saleOrderHeader);
//        this.getValidator().validate(saleOrderHeader, result);
//        if(result.hasErrors()) {
//            ResponseData requestCtx1 = new ResponseData(false);
//            requestCtx1.setMessage(this.getErrorMessage(result, request));
//            return requestCtx1;
//        } else {
//            IRequest requestCtx = this.createRequestContext(request);
//            return new ResponseData(this.saleOrderHeaderService.batchUpdate(requestCtx, saleOrderHeader));
//        }
//    }

    @RequestMapping({"/remove"})
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody List<SaleOrderHeader> saleOrderLines) {
        this.saleOrderHeaderService.batchDelete(saleOrderLines);
        return new ResponseData();
    }
}
