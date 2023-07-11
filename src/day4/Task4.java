package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int sum = 0;
        int max = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length - 2; i++) {
            sum += arr[i] + arr[i + 1] + arr[i + 2];
            if (max < sum) {
                max = sum;
                index = i;
            }
            sum = 0;
        }
        System.out.println(max + "\n" + index);
    }
}
