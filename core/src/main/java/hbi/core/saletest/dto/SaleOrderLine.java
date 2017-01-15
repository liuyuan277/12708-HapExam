package hbi.core.saletest.dto;

import com.hand.hap.core.annotation.MultiLanguage;
import com.hand.hap.core.annotation.MultiLanguageField;
import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.*;


@MultiLanguage
@ExtensionAttribute(
        disable = true
)
@Table(name="hap_om_order_lines_b")
public class SaleOrderLine extends BaseDTO {
    @Id
    @Column
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Integer lineId;
    @Column
    @Condition(operator = LIKE)
    private Integer headerId;
    @Column
    private Integer lineNumber;
    @Column
    private Integer inventoryItemId;
    @Transient
    private String itemCode;
    @Transient
    private String itemDescription;
    @Transient
    private String itemUom;
    @Column
    private Integer orderdQuantity;
    @Column
    private String orderQuantityUom;
    @Column
    private Float unitSellingPrice;
    @Column
    @MultiLanguageField
    private String description;
    @Column
    private Integer companyId;
    @Column
    private String addition1;
    @Column
    private String addition2;
    @Column
    private String addition3;
    @Column
    private String addition4;
    @Column
    private String addition5;
    @Transient
    private Float lineCount;

    public SaleOrderLine() {
    }

    public Float getLineCount() {
        return lineCount;
    }

    public void setLineCount(Float lineCount) {
        this.lineCount = lineCount;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemUom() {
        return itemUom;
    }

    public void setItemUom(String itemUom) {
        this.itemUom = itemUom;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Integer getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Integer headerId) {
        this.headerId = headerId;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Integer getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Integer inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Integer getOrderdQuantity() {
        return orderdQuantity;
    }

    public void setOrderdQuantity(Integer orderdQuantity) {
        this.orderdQuantity = orderdQuantity;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public void setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
    }

    public Float getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(Float unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getAddition1() {
        return addition1;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public String getAddition4() {
        return addition4;
    }

    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }

    public String getAddition5() {
        return addition5;
    }

    public void setAddition5(String addition5) {
        this.addition5 = addition5;
    }
}
