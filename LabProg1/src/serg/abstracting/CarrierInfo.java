package serg.abstracting;

public abstract class CarrierInfo {

    protected int id;

    public String getDescription() {
        return "{" + id + "}";
    }

    abstract Double getPrice(double volume);

    abstract Double getMaxVolume();
}
