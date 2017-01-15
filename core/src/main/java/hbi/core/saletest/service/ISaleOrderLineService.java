package hbi.core.saletest.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.IBaseService;
import hbi.core.saletest.dto.SaleOrderLine;

import java.util.List;

public interface ISaleOrderLineService extends IBaseService<SaleOrderLine> {
    List<SaleOrderLine> selectOrderLine(IRequest var1, SaleOrderLine var2, int var3, int var4);

    void deleteByHeaderId(Integer headerId);
}
