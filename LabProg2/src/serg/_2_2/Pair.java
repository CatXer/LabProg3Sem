package serg._2_2;

public class Pair {

    private String rawMat;
    private double pollution;


    public Pair(String rawMat, double pollution) {
        this.rawMat = rawMat;
        this.pollution = pollution;
    }

    public String getRawMat() {
        return rawMat;
    }

    public double getPollution() {
        return pollution;
    }

}
