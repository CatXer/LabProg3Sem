package serg.extending;

import java.util.Date;

public class Airplane extends Carrier {

    private String trackID;
    private String description;
    private final static Double airMultiply = 15.4;

    public Airplane(String trackID, int id, String title, Double volume, String description, Date transitDate) {
        super(id, title, volume, description, transitDate);
        this.trackID = trackID;
        this.description = description;
    }

    public String getTrackID() {
        return trackID;
    }

    public void setTrackID(String trackID) {
        this.trackID = trackID;
    }


    @Override
    public double getPrice(double volume) {
        return volume * airMultiply;
    }

    @Override
    public String getDescription() {
        return description + " { Track on -> " + trackID + " } ";
    }
}
