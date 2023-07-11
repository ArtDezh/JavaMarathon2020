package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("B:\\СамОбуч\\Джава\\Практика для начинающих в Java (2020)\\Практика для начинающих в Java (2020)\\[SW.BAND] JavaMarathon2020\\[SW.BAND] JavaMarathon2020\\src\\main\\resources\\shoes.csv");
        Scanner sc = new Scanner(file);
        PrintWriter pw = new PrintWriter("missing_shoe.txt");
        String str;
        while (sc.hasNextLine()) {
            str = sc.nextLine();
            String[] arrStr = str.split(";");
            if (Integer.parseInt(arrStr[2]) == 0) {
                pw.println(str.replace(';',','));
            }
        }
        sc.close();
        pw.close();
    }
}
