package hbi.core.saletest.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.IBaseService;
import hbi.core.saletest.dto.SaleOrderHeader;

import java.util.List;

/**
 * Created by liuyuan on 2017/1/11.
 */
public interface ISaleOrderHeaderService  extends IBaseService<SaleOrderHeader> {
    List<SaleOrderHeader> selectOrderHeader(IRequest var1, SaleOrderHeader var2, int var3, int var4);
}
