package co.cstad.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class HistoryDTO {

    private ItemDTO item;
    // Field of Item history
    private Long itemHistoryId;
    private Date updatedAt;
    private BigDecimal price;




    // Setter and getter of History Item

    public Long getItemHistoryId() {
        return itemHistoryId;
    }

    public void setItemHistoryId(Long itemHistoryId) {
        this.itemHistoryId = itemHistoryId;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemDTO getItem() {
        return item;
    }

    public void setItem(ItemDTO item) {
        this.item = item;
    }
}