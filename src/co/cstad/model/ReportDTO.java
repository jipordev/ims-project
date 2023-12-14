package co.cstad.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class ReportDTO {
    private Long stockCountId;
    private Integer stockInId;
    private Integer stockOutId;
    private Integer itemId;
    private LocalDate stockCountDate;
    private LocalDate stockOutDate;
    private BigDecimal priceOut;


    public void setStockOutDate(LocalDate stockOutDate) {
        this.stockOutDate = stockOutDate;
    }

    public LocalDate getStockOutDate() {
        return stockOutDate;
    }

    public void setPriceOut(BigDecimal priceOut) {
        this.priceOut = priceOut;
    }

    public BigDecimal getPriceOut() {
        return priceOut;
    }

    private Integer qty;
    private LocalDate stockInDate;
    private BigDecimal priceIn;
    private Integer lastQty;
    private Integer invoiceDetailId;
    private Integer invoiceId;
    private BigDecimal unitPrice;
    private Integer invoiceAdjustmentId;
    private LocalDate returnedDate;

    // setter and getter

    public void setStockCountId(Long stockCountId) {
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

    public Integer getStockOutId() {
        return stockOutId;
    }

    public void setStockOutId(Integer stockOutId) {
        this.stockOutId = stockOutId;
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

    public void setInvoiceAdjustmentId(Integer invoiceAdjustmentId) {
        this.invoiceAdjustmentId=invoiceAdjustmentId;
    }

    public void setReturnedDate(LocalDate returnedDate) {
        this.returnedDate = returnedDate;
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

    public Long getStockCountId() {
        return stockCountId;
    }

    public Integer getInvoiceAdjustmentId() {
        return invoiceAdjustmentId;
    }

    public LocalDate getReturnedDate() {
        return returnedDate;
    }

    private Integer itemHistoryId;
    private LocalDate updatedAt;
    private BigDecimal price;

    public void setItemPriceId(Integer itemHistoryId) {
        this.itemHistoryId = itemHistoryId;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getItemHistoryId() {
        return itemHistoryId;
    }

    public void setItemHistoryId(Integer itemHistoryId) {
        this.itemHistoryId = itemHistoryId;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
