package co.cstad.model;

import java.math.BigDecimal;
import java.util.Date;

public class StockOutDTO {
    private ItemDTO itemDTO;
    private Long stockOutID ;
    private Long itemId;
    private BigDecimal priceOut;
    private  Integer qtyOut;
    private Date stockOutDate;

    public ItemDTO getItemDTO() {
        return itemDTO;
    }

    public void setItemDTO(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
    }

    public Long getStockOutID() {
        return stockOutID;
    }

    public void setStockOutID(Long stockOutID) {
        this.stockOutID = stockOutID;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getPriceOut() {
        return priceOut;
    }

    public void setPriceOut(BigDecimal priceOut) {
        this.priceOut = priceOut;
    }

    public Integer getQtyOut() {
        return qtyOut;
    }

    public void setQtyOut(Integer qtyOut) {
        this.qtyOut = qtyOut;
    }

    public Date getStockOutDate() {
        return stockOutDate;
    }

    public void setStockOutDate(Date stockOutDate) {
        this.stockOutDate = stockOutDate;
    }
}