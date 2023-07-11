package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();
        File fil1 = new File("file1.txt");
        File fil2 = new File("file2.txt");

        PrintWriter pw1 = new PrintWriter(fil1);
        PrintWriter pw2 = new PrintWriter(fil2);
        for (int i = 0; i < 1000; i ++) {
            pw1.println(random.nextInt(100));
        }
        pw1.close();

        int sum = 0;
        double average = 0;
        int count = 0;
        Scanner sc = new Scanner(fil1);
        while (sc.hasNextLine()) {
            sum += Integer.parseInt(sc.nextLine());
            count++;
            if (count == 20) {
                average = sum / (double) 20;
                pw2.println(average);
                average = 0;
                count = 0;
                sum = 0;
            }
        }
        sc.close();
        pw2.close();

        printResult(fil2);
    }

    public  static void printResult(File file) throws FileNotFoundException {
        Scanner scFile2 = new Scanner(file);
        double sumDouble = 0;

        while (scFile2.hasNextLine()) {
            sumDouble += Double.parseDouble(scFile2.nextLine());
        }
        scFile2.close();
        System.out.println((int) sumDouble);
    }
}
