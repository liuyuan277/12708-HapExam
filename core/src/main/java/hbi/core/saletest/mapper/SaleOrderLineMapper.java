package hbi.core.saletest.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.saletest.dto.SaleOrderLine;

import java.util.List;

/**
 * Created by liuyuan on 2017/1/11.
 */
public interface SaleOrderLineMapper  extends Mapper<SaleOrderLine> {
    List<SaleOrderLine> selectSaleOrderLine(SaleOrderLine saleOrderLine);

    void deleteByHeaderId(Integer headerId);
   // void deleteTLByHeaderId(Integer headerId);
}
