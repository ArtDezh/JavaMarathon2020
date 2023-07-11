package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane p1 = new Airplane("Boeing", 2019, 25,20);
        Airplane p2 = new Airplane("Boeing", 2015, 30,15);
        Airplane.compareAirplanes(p1,p2);
    }
}
