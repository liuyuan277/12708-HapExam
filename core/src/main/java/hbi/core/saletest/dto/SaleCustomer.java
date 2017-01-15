package hbi.core.saletest.dto;

import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.*;

@ExtensionAttribute(
        disable = true
)
@Table(name="hap_ar_customers")
public class SaleCustomer extends BaseDTO {
    @Id
    @Column
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Integer customerId;
    @Column
    @Condition(operator = LIKE)
    private String customerNumber;
    @Column
    @Condition(operator = LIKE)
    private String customerName;
    @Column
    private Integer companyId;
    @Transient
    private String companyName;
    @Column
    private String enabledFlag;

    public SaleCustomer() {
    }

    public SaleCustomer(Integer customerId, String customerNumber, String customerName, Integer companyId, String companyNumber, String enabledFlag) {
        this.customerId = customerId;
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.companyId = companyId;
        this.companyName = companyName;
        this.enabledFlag = enabledFlag;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }
}
