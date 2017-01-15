package hbi.core.saletest.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.exception.TokenException;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.saletest.dto.SaleOrderLine;
import hbi.core.saletest.service.ISaleOrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/orderLine")
public class SaleOrderLineController extends BaseController {

    @Autowired
    private ISaleOrderLineService saleOrderLineService;

    public SaleOrderLineController() {
    }


    @RequestMapping({"/query"})
    public ResponseData getPosition(HttpServletRequest request, SaleOrderLine saleOrderLine, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int pagesize) {
        IRequest iRequest = this.createRequestContext(request);
        return new ResponseData(this.saleOrderLineService.selectOrderLine(iRequest, saleOrderLine, page, pagesize));
    }

//    @RequestMapping(
//            value = {"/submit"},
//            method = {RequestMethod.POST}
//    )
//    public ResponseData insert(@RequestBody List<SaleOrderLine> saleOrderLines, BindingResult result, HttpServletRequest request) throws TokenException {
//        this.checkToken(request, saleOrderLines);
//        this.getValidator().validate(saleOrderLines, result);
//        if(result.hasErrors()) {
//            ResponseData requestCtx1 = new ResponseData(false);
//            requestCtx1.setMessage(this.getErrorMessage(result, request));
//            return requestCtx1;
//        } else {
//            IRequest requestCtx = this.createRequestContext(request);
//            return new ResponseData(this.saleOrderLineService.batchUpdate(requestCtx, saleOrderLines));
//        }
//    }

    @RequestMapping(
            value = {"/submit"},
            method = {RequestMethod.POST}
    )
    public ResponseData insert(@RequestBody List<SaleOrderLine> saleOrderLines,HttpServletRequest request) {
            IRequest requestCtx = this.createRequestContext(request);
            return new ResponseData(this.saleOrderLineService.batchUpdate(requestCtx, saleOrderLines));

    }

    @RequestMapping(value="/remove/{headerId}")
    public ResponseData delete(@PathVariable("headerId")Integer headerId) {
       saleOrderLineService.deleteByHeaderId(headerId);
        return new ResponseData();
    }

}
