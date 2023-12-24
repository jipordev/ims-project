package co.cstad.model;

import java.util.Date;

public class DetailDTO {
    private ItemDTO itemDTO;
    private InvoiceDTO invoiceDTO;
    private CustomerDTO customerDTO;
    private StockOutDTO stockOutDTO;
    private PaymentDTO paymentDTO;
    private PaymentMethodDTO paymentMethodDTO;
    private Long detailId;
    private Long itemId;
    private Long invoiceId;

    public ItemDTO getItemDTO() {
        return itemDTO;
    }

    public void setItemDTO(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
    }

    public InvoiceDTO getInvoiceDTO() {
        return invoiceDTO;
    }

    public void setInvoiceDTO(InvoiceDTO invoiceDTO) {
        this.invoiceDTO = invoiceDTO;
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

    public void setStockOutDTO(StockOutDTO stockInDTO) {
        this.stockOutDTO = stockInDTO;
    }

    public PaymentDTO getPaymentDTO() {
        return paymentDTO;
    }

    public void setPaymentDTO(PaymentDTO paymentDTO) {
        this.paymentDTO = paymentDTO;
    }

    public PaymentMethodDTO getPaymentMethodDTO() {
        return paymentMethodDTO;
    }

    public void setPaymentMethodDTO(PaymentMethodDTO paymentMethodDTO) {
        this.paymentMethodDTO = paymentMethodDTO;
    }

    public Long getDetailId() {
        return detailId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }
}
