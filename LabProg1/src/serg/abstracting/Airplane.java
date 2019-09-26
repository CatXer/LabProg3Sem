package serg.abstracting;

import java.util.Date;

public class Airplane extends Carrier {

    private String trackID;
    private final static Double airMultiply = 15.4;

    public Airplane(String trackID, int id, String title, Double maxVolume, String description, Date transitDate) {
        super(id, title, maxVolume, description, transitDate);
        this.trackID = trackID;
    }

    public String getTrackID() {
        return trackID;
    }

    public void setTrackID(String trackID) {
        this.trackID = trackID;
    }

    @Override
    public Double getPrice(double volume) {
        return volume * airMultiply;
    }

    @Override
    public String getDescription() {
        return description + " { Track on -> " + trackID + " } ";
    }
}
