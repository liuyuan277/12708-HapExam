package hbi.core.saletest.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.saletest.dto.SaleOrderLine;
import hbi.core.saletest.mapper.SaleOrderLineMapper;
import hbi.core.saletest.service.ISaleOrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleOrderLineServiceImpl extends BaseServiceImpl<SaleOrderLine> implements ISaleOrderLineService {

    @Autowired
    private SaleOrderLineMapper saleOrderLineMapper;

    @Override
    public List<SaleOrderLine> selectOrderLine(IRequest var1, SaleOrderLine saleOrderLine, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return saleOrderLineMapper.selectSaleOrderLine(saleOrderLine);
    }

    @Override
    public void deleteByHeaderId(Integer headerId) {
        saleOrderLineMapper.deleteByHeaderId(headerId);
        //saleOrderLineMapper.deleteTLByHeaderId(headerId);
    }
}
