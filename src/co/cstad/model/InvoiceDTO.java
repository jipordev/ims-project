package co.cstad.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InvoiceDTO {
    private Long invoiceId;
    private String invoiceNo;
    private Date invoiceDate;
    private Double discount;
    private LocalDate purchaseDate;
    private BigDecimal discount;
    private Boolean isCancelled;
    private Boolean status;
    private Boolean isPaid;
    private Long customerId;
    private Long stockOutId;

    private CustomerDTO customerDTO;
    private StockOutDTO stockOutDTO;

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

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date purchaseDate) {
        this.invoiceDate = purchaseDate;
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
    public void setDiscount(Double discount) {
        this.discount = discount;
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

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getStockOutId() {
        return stockOutId;
    }

    public void setStockOutId(Long stockOutId) {
        this.stockOutId = stockOutId;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public StockOutDTO getStockOutDTO() {
        return stockOutDTO;
    }

    public void setStockOutDTO(StockOutDTO stockOutDTO) {
        this.stockOutDTO = stockOutDTO;
    }
}