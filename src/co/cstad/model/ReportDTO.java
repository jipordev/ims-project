package co.cstad.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReportDTO {
    private Integer stockCountId;
    private Integer stockInId;
    private Integer itemId;
    private LocalDate stockCountDate;
    private Integer qty;
    private LocalDate stockInDate;
    private BigDecimal priceIn;
    private Integer lastQty;
    private Integer invoiceDetailId;
    private Integer invoiceId;
    private BigDecimal unitPrice;
    private String invoiceAdjustment;
    private LocalDate returnedDate;

    // setter and getter

    public void setStockCountId(Integer stockCountId) {
        this.stockCountId = stockCountId;
    }

    public void setStockInId(Integer stockInId) {
        this.stockInId = stockInId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public void setStockCountDate(LocalDate stockCountDate) {
        this.stockCountDate = stockCountDate;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public void setStockInDate(LocalDate stockInDate) {
        this.stockInDate = stockInDate;
    }

    public void setPriceIn(BigDecimal priceIn) {
        this.priceIn = priceIn;
    }

    public void setLastQty(Integer lastQty) {
        this.lastQty = lastQty;
    }

    public void setInvoiceDetailId(Integer invoiceDetailId) {
        this.invoiceDetailId = invoiceDetailId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setInvoiceAdjustment(String invoiceAdjustment) {
        this.invoiceAdjustment = invoiceAdjustment;
    }

    public void setReturnedDate(LocalDate returnedDate) {
        this.returnedDate = returnedDate;
    }

    public Integer getStockCountId() {
        return stockCountId;
    }

    public Integer getStockInId() {
        return stockInId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public LocalDate getStockCountDate() {
        return stockCountDate;
    }

    public Integer getQty() {
        return qty;
    }

    public LocalDate getStockInDate() {
        return stockInDate;
    }

    public BigDecimal getPriceIn() {
        return priceIn;
    }

    public Integer getLastQty() {
        return lastQty;
    }

    public Integer getInvoiceDetailId() {
        return invoiceDetailId;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public String getInvoiceAdjustment() {
        return invoiceAdjustment;
    }

    public LocalDate getReturnedDate() {
        return returnedDate;
    }
}
