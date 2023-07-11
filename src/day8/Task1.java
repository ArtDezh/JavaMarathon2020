package day8;

public class Task1 {
    public static void main(String[] args) {
        String str = "";
        long before = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            str += i + " ";
        }
        long after = System.currentTimeMillis();
        System.out.println("Время потраченое на класс String " + (after - before) + " мс");
        System.out.println(str);

        StringBuilder sb = new StringBuilder("");
        long before1 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        long after1 = System.currentTimeMillis();
        System.out.println("Время потраченое на класс StringBuilder " + (after1 - before1) + " мс");
        System.out.println(sb);
    }
}
