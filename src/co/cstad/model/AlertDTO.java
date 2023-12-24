package co.cstad.model;

public class AlertDTO {

    private ItemDTO item;


    //Field of Alert
    private Long alertId;
    private Integer qytAlert;
    private String name;



    // Setter and getter of item alert

    public Long getAlertId() {
        return alertId;
    }

    public void setAlertId(Long alertId) {
        this.alertId = alertId;
    }

    public Integer getQytAlert() {
        return qytAlert;
    }

    public void setQytAlert(Integer qytAlert) {
        this.qytAlert = qytAlert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setItem(ItemDTO item) {
        this.item = item;
    }

    public ItemDTO getItem() {
        return item;
    }
}