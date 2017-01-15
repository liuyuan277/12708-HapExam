package hbi.core.saletest.dto;

import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@ExtensionAttribute(
        disable = true
)
@Table(name="hap_inv_inventory_items")
public class SaleInventory  extends BaseDTO {
    @Id
    @Column
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Integer inventoryItemId;
    @Column
    private String itemCode;
    @Column
    private String itemUom;
    @Column
    private String itemDescription;
    @Column
    private String orderFlag;
    @Column
    private Date startActiveDate;
    @Column
    private Date endActiveDate;
    @Column
    private String enabledFlag;


    public SaleInventory() {

    }

    public SaleInventory(Integer inventoryItemId, String itemCode, String itemUom, String itemDescription, String orderFlag, Date startActiveDate, Date endActiveDate, String enabledFlag) {
        this.inventoryItemId = inventoryItemId;
        this.itemCode = itemCode;
        this.itemUom = itemUom;
        this.itemDescription = itemDescription;
        this.orderFlag = orderFlag;
        this.startActiveDate = startActiveDate;
        this.endActiveDate = endActiveDate;
        this.enabledFlag = enabledFlag;
    }

    public Integer getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Integer inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemUom() {
        return itemUom;
    }

    public void setItemUom(String itemUom) {
        this.itemUom = itemUom;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(String orderFlag) {
        this.orderFlag = orderFlag;
    }

    public Date getStartActiveDate() {
        return startActiveDate;
    }

    public void setStartActiveDate(Date startActiveDate) {
        this.startActiveDate = startActiveDate;
    }

    public Date getEndActiveDate() {
        return endActiveDate;
    }

    public void setEndActiveDate(Date endActiveDate) {
        this.endActiveDate = endActiveDate;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }
}
