package serg.abstracting;

import javafx.geometry.Point2D;

import java.util.Date;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        CarrierInfo[] carriers = new CarrierInfo[7];
        carriers[0] = new Ship(new Point2D(33.4, 55.3), 3, "Airplane", 99.4, "Ship cargo", new Date());
        carriers[1] = new Airplane("RU4277773433", 3, "Airplane", 9.4, "Air rout 01", new Date());
        carriers[2] = new Airplane("ZA4343223433", 3, "Airplane", 11.4, "Air rout 02", new Date());
        carriers[3] = new Airplane("LL4343223433", 3, "Airplane", 3.4, "Air rout 03", new Date());
        carriers[4] = new Ship(new Point2D(63.4, 23.3), 3, "Ship", 909.4, "", new Date());
        carriers[5] = new Airplane("RU4345223433", 3, "Airplane", 349.4, "Air rout 04", new Date());
        carriers[6] = new Ship(new Point2D(3.4, 52.3), 3, "Ship", 22.4, "", new Date());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter volume (T):");
        double volume = scanner.nextDouble();

        double minPlane = 0;
        double minShip = 0;
        System.out.println("Abstracting...");
        for (CarrierInfo c : carriers) {
            if (c.getMaxVolume() >= volume) {
                if (c instanceof Airplane && (c.getPrice(volume) <= minPlane || minPlane == 0))
                    minPlane = c.getPrice(volume);
                else if (c instanceof Ship && (c.getPrice(volume) <= minShip || minShip == 0))
                    minShip = c.getPrice(volume);
            }
        }
        System.out.println(minPlane != 0 ? "\nAirplane minimal price = " + minPlane + "\n" : "");
        System.out.println(minShip != 0 ? "\nShip minimal price = " + minShip + "\n" : "");
        for (CarrierInfo c : carriers) {
            if (c.getMaxVolume() >= volume) {
                System.out.println(c);
                System.out.println("\t Price : " + c.getPrice(volume));
                System.out.println("\t Description : " + c.getDescription());
                System.out.println("\t Max volume : " + c.getMaxVolume()+'\n');
            }
        }
    }
}
