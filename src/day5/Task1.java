package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2017);
        car1.setColor("Red");
        car1.setModel("BMW");

        System.out.println(car1.getYear());
        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
    }
}
