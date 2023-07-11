package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        int biggerThan8 = 0;
        int eq1 = 0;
        int odd = 0;
        int even = 0;
        int sumElement = 0;

        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
            if (arr[i] > 8) biggerThan8++;
            if (arr[i] == 1) eq1++;
            if (arr[i] % 2 == 0) odd++;
            if (arr[i] % 2 != 0) even++;
            sumElement += arr[i];
        }
        System.out.println("\nДлинна массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + biggerThan8);
        System.out.println("Количество чисел равных 1: " + eq1);
        System.out.println("Количество четных чисел: " + odd);
        System.out.println("Количество нечетных чисел: " + even);
        System.out.println("Сумма всех элемнтов массива: " + sumElement);
    }
}
