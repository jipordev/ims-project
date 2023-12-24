package co.cstad.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InvoiceDTO {
    private Long invoiceId;
    private String invoiceNo;
    private LocalDate purchaseDate;
    private BigDecimal discount;
    private Boolean isCancelled;
    private Boolean status;
    private Boolean isPaid;
    public CustomerDTO customer = new CustomerDTO();

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        if (discount != null) {
            this.discount = discount;
        } else {
            // Assign a default value when discount is null
            this.discount = BigDecimal.valueOf(0.0);
        }
    }
    public Boolean getCancelled() {
        return isCancelled;
    }

    public void setCancelled(Boolean cancelled) {
        isCancelled = cancelled;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }
}