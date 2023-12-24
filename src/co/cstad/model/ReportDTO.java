package co.cstad.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class ReportDTO {
    private Long stockCountId;
    private Long stockInId;
    private Long stockOutId;
    private Long itemId;
    private LocalDate stockCountDate;
    private LocalDate stockOutDate;
    private BigDecimal priceOut;
    private ItemDTO item;

    public ItemDTO getItem() {
        return item;
    }

    public void setItem(ItemDTO item) {
        this.item = item;
    }

    public Long getStockInId() {
        return stockInId;
    }

    public void setStockInId(Long stockInId) {
        this.stockInId = stockInId;
    }

    public Long getStockOutId() {
        return stockOutId;
    }

    public void setStockOutId(Long stockOutId) {
        this.stockOutId = stockOutId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setStockCountDate(LocalDate stockCountDate) {
        this.stockCountDate = stockCountDate;
    }

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
    private Integer itemQty;

    // setter and getter

    public Integer getItemQty() {
        return itemQty;
    }

    public void setItemQty(Integer itemQty) {
        this.itemQty = itemQty;
    }

    public void setStockCountId(Long stockCountId) {
        this.stockCountId = stockCountId;
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

    private Long itemHistoryId;
    private LocalDate updatedAt;
    private BigDecimal price;

    public Long getItemHistoryId() {
        return itemHistoryId;
    }

    public void setItemHistoryId(Long itemHistoryId) {
        this.itemHistoryId = itemHistoryId;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
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
    private Long alertId;
    private Integer qytAlert;
    private String name;

    public Long getAlertId() {
        return alertId;
    }

    public void setAlertId(Long alertId) {
        this.alertId = alertId;
    }

    public Integer getQytAlert() {
        return qytAlert;
    }

    public void setQytAlert(Integer qytAlert) {
        this.qytAlert = qytAlert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
