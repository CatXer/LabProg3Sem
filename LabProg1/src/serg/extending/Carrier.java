package serg.extending;

import java.util.Date;

public class Carrier {

    private int id;
    private String title;
    private Double MaxVolume;
    private String description;
    private Date transitDate;


    public Carrier(int id, String title, Double MaxVolume, String description, Date transitDate) {
        this.id = id;
        this.title = title;
        this.MaxVolume = MaxVolume;
        this.description = description;
        this.transitDate = transitDate;
    }


    public double getPrice(double volume) {
        return volume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getMaxVolume() {
        return MaxVolume;
    }

    public void setMaxVolume(Double maxVolume) {
        this.MaxVolume = maxVolume;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTransitDate() {
        return transitDate;
    }

    public void setTransitDate(Date transitDate) {
        this.transitDate = transitDate;
    }

    @Override
    public String toString() {
        return "{" + "title:" + title + ", Max volume:" + MaxVolume + ", description:" + description + ", date:" + transitDate + "}";
    }
}
