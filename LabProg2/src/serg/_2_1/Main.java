package serg._2_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        FileWriter writer;

        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();

        try {
            // 1 file
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()) {
                set1.add(scanner.nextLine());
            }
            scanner.close();
            // 2 file
            scanner = new Scanner(file2);
            while (scanner.hasNextLine()) {
                set2.add(scanner.nextLine());
            }
            scanner.close();
            System.out.println("Data from files:");
            System.out.println("set1: " + set1);
            System.out.println("set2: " + set2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // diff
        int oldSize = set1.size();
        getDiff(set1, set2);
        System.out.println(oldSize - set1.size() + " elements was removed from set1.");
        System.out.println("New set1: " + set1);

        try {
            writer = new FileWriter(file1, false);
            for (String s : set1) {
                writer.write(s + '\n');
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getDiff(Set<String> set1, Set<String> set2) {
        set1.removeAll(set2);
    }
}
