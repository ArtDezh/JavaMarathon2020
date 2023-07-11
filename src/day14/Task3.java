package day14;

import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args) {
        try {
            System.out.println(Person.parseFileToObjList());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }

}
