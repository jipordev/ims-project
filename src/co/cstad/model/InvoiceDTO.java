package co.cstad.model;


import java.util.Date;

public class InvoiceDTO {
    private Long invoiceId;
    private String invoiceNo;
    private Date invoiceDate;
    private Double discount;
    private Boolean isCancelled;
    private Boolean status;
    private Boolean isPaid;
    private Long customerId;
    private Long stockOutId;

    private CustomerDTO customerDTO;
    private StockOutDTO stockOutDTO;

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

    public Double getDiscount() {
        return discount;
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