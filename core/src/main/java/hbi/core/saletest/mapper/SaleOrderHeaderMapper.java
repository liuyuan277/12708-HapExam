package hbi.core.saletest.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.saletest.dto.SaleOrderHeader;

import java.util.List;

/**
 * Created by liuyuan on 2017/1/11.
 */
public interface SaleOrderHeaderMapper extends Mapper<SaleOrderHeader> {
    List<SaleOrderHeader> selectOrderHeader(SaleOrderHeader films);
}
