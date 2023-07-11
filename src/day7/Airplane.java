package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private double weight;
    private double fuel = 0.0;

    public Airplane(String producer, int year, int length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + getFuel());

    }

    public void fillUp(double x) {
        fuel = x;
    }

    public static void compareAirplanes(Airplane plane1, Airplane plane2) {
        if (plane1.length > plane2.length) System.out.println("Самолет 1 длинее, чем самолет 2");
        else System.out.println("Самолет 2 длинее, чем самолет 1");
    }
}
