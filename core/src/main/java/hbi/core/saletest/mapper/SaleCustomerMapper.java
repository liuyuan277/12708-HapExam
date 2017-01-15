package hbi.core.saletest.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.saletest.dto.SaleCustomer;

import java.util.List;

public interface SaleCustomerMapper extends Mapper<SaleCustomer> {
    List<SaleCustomer> selectSaleCustomer(SaleCustomer var1);
}
