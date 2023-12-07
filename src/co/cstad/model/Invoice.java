package co.cstad.model;

public class Invoice {
    private Long id;
    private String invoiceNo;
    private Double discount;
    private Boolean isCancelled;
    private Boolean status;
    private Boolean isPaid;
    private CustomerDTO customerDTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
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

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }
}
