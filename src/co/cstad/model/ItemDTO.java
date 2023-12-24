package co.cstad.model;

import java.math.BigDecimal;
import java.time.Duration;

public class ItemDTO {
    private Long alertId;
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

    public Long getAlertId() {
        return alertId;
    }

    public void setAlertId(Long alertId) {
        this.alertId = alertId;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
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

    public void setItemPrice_out_a(BigDecimal itemPrice_out_a) {
        this.itemPrice_out_a = itemPrice_out_a;
    }

    public BigDecimal getItemPrice_out_b() {
        return itemPrice_out_b;
    }

    public void setItemPrice_out_b(BigDecimal itemPrice_out_b) {
        this.itemPrice_out_b = itemPrice_out_b;
    }

    public BigDecimal getItemPrice_out_c() {
        return itemPrice_out_c;
    }

    public void setItemPrice_out_c(BigDecimal itemPrice_out_c) {
        this.itemPrice_out_c = itemPrice_out_c;
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
