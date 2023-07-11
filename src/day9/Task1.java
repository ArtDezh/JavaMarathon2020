package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Ivan","411");
        Teacher teacher = new Teacher("Artem", "HighTech");
        System.out.println(student.getNameGroup() + " " + teacher.getNameSubject());
        student.printInfo();
        teacher.printInfo();
    }
}
