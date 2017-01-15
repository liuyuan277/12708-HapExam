package hbi.core.saletest.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.saletest.dto.SaleOrderHeader;
import hbi.core.saletest.mapper.SaleOrderHeaderMapper;
import hbi.core.saletest.service.ISaleOrderHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleOrderHeaderServiceImpl extends BaseServiceImpl<SaleOrderHeader> implements ISaleOrderHeaderService {

    @Autowired
    private SaleOrderHeaderMapper saleOrderHeaderMapper;

    @Override
    public List<SaleOrderHeader> selectOrderHeader(IRequest var1, SaleOrderHeader saleOrderHeader,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return saleOrderHeaderMapper.selectOrderHeader(saleOrderHeader);
    }

}
