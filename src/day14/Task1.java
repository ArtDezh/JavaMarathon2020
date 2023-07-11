package day14;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        String str = sc.nextLine();
        String[] arrStr = str.split(" ");
        if (arrStr.length != 10) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл!");
                System.exit(0);
            }
        }
        int sum = 0;

        for (String s : arrStr) sum += Integer.parseInt(s);
        System.out.println(sum);
        sc.close();
    }
}
