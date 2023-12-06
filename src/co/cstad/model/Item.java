package co.cstad.model;

public class Item {

    private Long id;
    private String code;
    private String description;
    private String unit;
    private Integer qty;
    private Double price_A;
    private Double price_B;
    private Double price_C;
    private Boolean status;

    public Item() {

    }

    public Item(Long id, String code, String description, String unit, Integer qty, Double price_A, Double price_B, Double price_C, Boolean status) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.unit = unit;
        this.qty = qty;
        this.price_A = price_A;
        this.price_B = price_B;
        this.price_C = price_C;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getPrice_A() {
        return price_A;
    }

    public void setPrice_A(Double price_A) {
        this.price_A = price_A;
    }

    public Double getPrice_B() {
        return price_B;
    }

    public void setPrice_B(Double price_B) {
        this.price_B = price_B;
    }

    public Double getPrice_C() {
        return price_C;
    }

    public void setPrice_C(Double price_C) {
        this.price_C = price_C;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
