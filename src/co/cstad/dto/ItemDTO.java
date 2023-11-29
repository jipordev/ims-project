package co.cstad.dto;

public class ItemDTO {
    private int itemId;
    private String itemCode;
    private String itemDescription;
    private String itemUnit;
    private double itemPrice_out_a;
    private double itemPrice_out_b;
    private double itemPrice_out_c;
    private int qty;
    private int capacity;
    private boolean status;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public double getItemPrice_out_a() {
        return itemPrice_out_a;
    }

    public void setItemPrice_out_a(double itemPrice_out_a) {
        this.itemPrice_out_a = itemPrice_out_a;
    }

    public double getItemPrice_out_b() {
        return itemPrice_out_b;
    }

    public void setItemPrice_out_b(double itemPrice_out_b) {
        this.itemPrice_out_b = itemPrice_out_b;
    }

    public double getItemPrice_out_c() {
        return itemPrice_out_c;
    }

    public void setItemPrice_out_c(double itemPrice_out_c) {
        this.itemPrice_out_c = itemPrice_out_c;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
