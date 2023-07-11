package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if (y == 0) break;
            System.out.println(x / y);
        }

    }
}
