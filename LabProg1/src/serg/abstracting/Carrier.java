package serg.abstracting;

import java.util.Date;

public class Carrier extends CarrierInfo {

    private String title;
    protected Double maxVolume;
    protected String description;
    private Date transitDate;


    public Carrier(int id, String title, Double maxVolume, String description, Date transitDate) {
        super.id = id;
        this.title = title;
        this.maxVolume = maxVolume;
        this.description = description;
        this.transitDate = transitDate;
    }


    public Double getPrice(double volume) {
        return volume;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(Double maxVolume) {
        this.maxVolume = maxVolume;
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
        return "{" + "title:" + title + ", max volume:" + maxVolume + ", description:" + description + ", date:" + transitDate + "}";
    }

}
