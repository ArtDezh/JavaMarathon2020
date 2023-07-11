package day14;

import java.io.*;
import java.util.*;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Person> parseFileToObjList() throws FileNotFoundException {
        File file = new File("people.txt");
        List<Person> result = new ArrayList<>();
        Scanner sc = new Scanner(file);
        String str;
        while (sc.hasNextLine()) {
            str = sc.nextLine();
            String[] arrStr = str.split(" ");
            if (Integer.parseInt(arrStr[1]) < 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл!");
                    System.exit(0);
                }
            }
            result.add(new Person(arrStr[0], Integer.parseInt(arrStr[1])));
        }
        sc.close();
        return result;
    }

    @Override
    public String toString() {
        return "{name = " + "'" + getName() + "'" + ", Age = " + getAge() + "}";
    }
}
