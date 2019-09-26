package serg;

public class Carrier {
    private String type;
    private String title;
    private int id;
    private String trackId;
    private double volume;
    private boolean global;

    public Carrier(String type, String title, int id, String trackId, double volume, boolean global) {
        this.type = type;
        this.title = title;
        this.id = id;
        this.trackId = trackId;
        this.volume = volume;
        this.global = global;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getTrackId() {
        return trackId;
    }

    public double getVolume() {
        return volume;
    }

    public boolean isGlobal() {
        return global;
    }


}
