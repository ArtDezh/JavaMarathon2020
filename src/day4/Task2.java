package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int min = 0;
        int max = 0;
        int countOnZero = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }

        for (int i: arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
            if (i % 10 == 0) {
                countOnZero++;
                sum += i;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Кол-во элем-ов массива, оканчивающихся на 0: " + countOnZero);
        System.out.println("Сумма x эл-ов массива, оканчивающихся на 0: " + sum);
    }
}
