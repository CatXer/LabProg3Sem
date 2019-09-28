package serg;

public class Carrier {
    private String type;
    private String name;
    private int id;
    private String trackId;
    private double volume;
    private boolean global;

    public Carrier(int id, String type, String name, String trackId, double volume, boolean global) {
        this.type = type;
        this.name = name;
        this.id = id;
        this.trackId = trackId;
        this.volume = volume;
        this.global = global;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
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
