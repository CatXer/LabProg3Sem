package serg.implementing;

import javafx.geometry.Point2D;

import java.util.Date;

public class Ship extends Carrier {

    private Point2D googleMapsXY;
    private final static Double shipMultiply = 10.3;

    public Ship(Point2D gmXY, String title, Double volume, String description, Date transitDate) {
        super(title, volume, description, transitDate);
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
