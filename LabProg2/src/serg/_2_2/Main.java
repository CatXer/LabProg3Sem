package serg._2_2;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Reading data from file ...");
        Storage storage = new Storage("fileDB.txt");
        System.out.println("Source Data Table:");
        storage.printTable(storage.getSourceList());
        double middlePollution = storage.getMiddlePollution();
        List<Pair> excessPollutionList = storage.getExcessPollutionList(middlePollution);
        System.out.println("Excess Pollution Data Table:");
        storage.printTable(excessPollutionList);
        System.out.println("Saving result into the file ...");
        storage.saveData("ExcessPollutions.txt", excessPollutionList);

    }
}
