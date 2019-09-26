package serg.implementing;

import java.util.Date;

public class Carrier implements Comparable {

    private String title;
    protected Double maxVolume;
    protected String description;
    private Date transitDate;
    private boolean isRemoved = false;

    public Carrier(String title, Double maxVolume, String description, Date transitDate) {
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


    public String getDescription() {
        return description;
    }

    @Override
    public Double getMaxVolume() {
        return maxVolume;
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
        return "{" + "title:" + title + ", Max volume:" + maxVolume + ", description:" + description + ", date:" + transitDate + "}";
    }


}
