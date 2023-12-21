package co.cstad.model;

import java.math.BigDecimal;
import java.util.Date;

public class StockInDTO {
    private Long stockInID ;
    private Long itemId;
    private BigDecimal priceIn;
    private  Integer qtyIn;
    private Date stockInDate;

    public Long getStockInID() {
        return stockInID;
    }

    public void setStockInID(Long stockInID) {
        this.stockInID = stockInID;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(BigDecimal priceIn) {
        this.priceIn = priceIn;
    }

    public Integer getQtyIn() {
        return qtyIn;
    }

    public void setQtyIn(Integer qtyIn) {
        this.qtyIn = qtyIn;
    }

    public Date getStockInDate() {
        return stockInDate;
    }

    public void setStockInDate(Date stockInData) {
        this.stockInDate = stockInData;
    }
}