package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> nameCars = new ArrayList<>();

        nameCars.add("Honda");
        nameCars.add("Ford");
        nameCars.add("Mazda");
        nameCars.add("Fiat");
        nameCars.add("BMW");

        for (String car: nameCars) System.out.println(car);

        nameCars.add((nameCars.size()/2), "Kia");
        nameCars.remove(0);

        System.out.println("-------------------------------------");
        for (String car: nameCars) System.out.println(car);

    }
}
