package co.cstad.model;

import java.time.LocalDate;

public class InvoiceDTO {
    private Long invoiceId;
    private String invoiceNo;
    private LocalDate purchaseDate;
    private Double discount;
    private Boolean isCancelled;
    private Boolean status;
    private Boolean isPaid;
    public CustomerDTO customer = new CustomerDTO();

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

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        if (discount != null) {
            this.discount = Double.parseDouble(discount.replaceAll("[^0-9.]", ""));
        } else {
            // Assign a default value when discount is null
            this.discount = 0.0;
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
