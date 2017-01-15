package hbi.core.saletest.dto;

import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@ExtensionAttribute(
        disable = true
)
@Table(name="hap_om_order_headers")
public class SaleOrderHeader  extends BaseDTO {

    @Id
    @Column
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Integer headerId;
    @Column
    @Condition(operator = LIKE)
    private String orderNumber;
    @Column
    private Integer companyId;
    @Transient
    private String  companyName;
    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDate;
    @Column
    @Condition(operator = LIKE)
    private String orderStatus;
    @Column
    private Integer customerId;
    @Transient
    private String customerName;
    @Transient
    private Float orderCount;
    @Transient
    private Integer inventoryItemId;

    public SaleOrderHeader() {
    }

    public SaleOrderHeader(String orderNumber, Integer companyId, String companyName, Date orderDate, String orderStatus, Integer customerId, String customerName, Float orderCount, Integer inventoryItemId) {
        this.orderNumber = orderNumber;
        this.companyId = companyId;
        this.companyName = companyName;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.customerId = customerId;
        this.customerName = customerName;
        this.orderCount = orderCount;
        this.inventoryItemId = inventoryItemId;
    }

    public Integer getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Integer inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Float getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Float orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Integer headerId) {
        this.headerId = headerId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }



    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
