package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if (y == 0) System.out.println("Деление на 0");
            if (y != 0) System.out.println(x / y);
        }


    }
}
