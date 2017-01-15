package hbi.core.saletest.dto;

import com.hand.hap.core.annotation.MultiLanguage;
import com.hand.hap.core.annotation.MultiLanguageField;
import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.*;

@ExtensionAttribute(
        disable = true
)
@Table(name="hap_org_companys")
public class SaleCompany extends BaseDTO {
    @Id
    @Column
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Integer companyId;
    @Column
    @Condition(operator = LIKE)
    private String  companyNumber;
    @Column
    @Condition(operator = LIKE)
    private String companyName;
    @Column
    @Condition(operator = LIKE)
    private String enabledFlag;

    public SaleCompany() {
    }

    public SaleCompany(Integer companyId, String companyNumber, String companyName, String enabledFlag) {
        this.companyId = companyId;
        this.companyNumber = companyNumber;
        this.companyName = companyName;
        this.enabledFlag = enabledFlag;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
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
