package serg.extending;

import javafx.geometry.Point2D;

import java.util.Date;

public class Ship extends Carrier {

    private Point2D googleMapsXY;
    private String description;
    private final static Double shipMultiply = 10.3;

    public Ship(Point2D gmXY, int id, String title, Double volume, String description, Date transitDate) {
        super(id, title, volume, description, transitDate);
        googleMapsXY = gmXY;
        this.description = description;
    }


    @Override
    public String getDescription() {
        return description + " { Destination is :" + googleMapsXY + " }";
    }

    @Override
    public double getPrice(double volume) {
        return volume * shipMultiply;
    }

    public Point2D getGoogleMapsXY() {
        return googleMapsXY;
    }

    public void setGoogleMapsXY(Point2D googleMapsXY) {
        this.googleMapsXY = googleMapsXY;
    }

}
