package serg.abstracting;

import javafx.geometry.Point2D;

import java.util.Date;

public class Ship extends Carrier {

    private Point2D googleMapsXY;
    private final static Double shipMultiply = 10.3;

    public Ship(Point2D gmXY, int id, String title, Double maxVolume, String description, Date transitDate) {
        super(id, title, maxVolume, description, transitDate);
        googleMapsXY = gmXY;
    }


    @Override
    public String getDescription() {
        return description + " { Destination is :" + googleMapsXY + " }";
    }

    @Override
    public Double getPrice(double volume) {
        return volume * shipMultiply;
    }

    public Point2D getGoogleMapsXY() {
        return googleMapsXY;
    }

    public void setGoogleMapsXY(Point2D googleMapsXY) {
        this.googleMapsXY = googleMapsXY;
    }

}
