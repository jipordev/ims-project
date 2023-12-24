package co.cstad.model;

import java.math.BigDecimal;

import co.cstad.util.handle.Handle;

public class ItemDTO {
    private Long itemId;
    private String itemCode;
    private String itemDescription;
    private String itemUnit;
    private BigDecimal itemPrice;
    private BigDecimal itemPrice_out_a;
    private BigDecimal itemPrice_out_b;
    private BigDecimal itemPrice_out_c;
    private Integer qty;
    private Boolean status;

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = Handle.XdrToBigDecimalConverter(itemPrice.toString());
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
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

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public BigDecimal getItemPrice_out_a() {
        return itemPrice_out_a;
    }

    public void setItemPrice_out_a(String itemPrice_out_a) {
        this.itemPrice_out_a = Handle.XdrToBigDecimalConverter(itemPrice_out_a.toString());
    }

    public BigDecimal getItemPrice_out_b() {
        return itemPrice_out_b;
    }

    public void setItemPrice_out_b(String itemPrice_out_b) {
        this.itemPrice_out_b = Handle.XdrToBigDecimalConverter(itemPrice_out_b.toString());
    }

    public BigDecimal getItemPrice_out_c() {
        return itemPrice_out_c;
    }

    public void setItemPrice_out_c(String itemPrice_out_c) {
        this.itemPrice_out_c = Handle.XdrToBigDecimalConverter(itemPrice_out_c.toString());
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Boolean isStatus() {
        return status;
    }
}
