package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane ap = new Airplane("Boeing", 2013, 27, 35);
        ap.setYear(2015);
        ap.setLength(32);
        ap.fillUp(15.0);
        ap.fillUp(23);
        ap.info();
    }
}
