package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2020);
        System.out.println(car1.yearDifference(2023));

        Motorbike mb = new Motorbike(2010, "Red", "Suzuki");
        mb.info();
    }
}
