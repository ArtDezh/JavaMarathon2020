package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] arrNumbers = {5, 10, 15, 20, 25, 30, 35, 40};
        System.out.println(recursionSum(arrNumbers, 0));
    }

    public static int recursionSum(int[] arrNumbers, int i) {
        if (i == arrNumbers.length) return 0;
        return arrNumbers[i] + recursionSum(arrNumbers, i + 1);
    }
}
