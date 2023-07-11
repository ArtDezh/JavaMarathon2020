package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        String str = sc.nextLine();
        String[] arrStr = str.split(" ");
        sc.close();
        int sum = 0;
        for (String s: arrStr) sum += Integer.parseInt(s);
        double average = sum / (double) arrStr.length;
        System.out.printf(average + " --> %.3f", average);
    }
}
