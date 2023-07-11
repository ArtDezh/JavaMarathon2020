package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        int max = 0;
        int index = 0;
        int sumStr = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 50);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumStr += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            if (max < sumStr) {
                max = sumStr;
                index = i;

            }
            System.out.print(" --- " + sumStr);
            System.out.println();
            sumStr = 0;
        }

        System.out.println("\n" + index);
    }
}
