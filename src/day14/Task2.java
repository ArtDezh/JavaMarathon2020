package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            System.out.println(parseFileToStringList());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }

    public static List<String> parseFileToStringList() throws FileNotFoundException {
        File file = new File("people.txt");
        Scanner sc = new Scanner(file);
        List<String> result = new ArrayList<>();

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] arrStr = str.split(" ");
            if (Integer.parseInt(arrStr[1]) < 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл!");
                    System.exit(0);
                }
            }
            result.add(str);
        }
        sc.close();
        return result;
    }
}
