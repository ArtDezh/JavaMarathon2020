package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int number = (int) (2 + Math.random() * 4);
        String grade = "";
        switch (number) {
            case 2: grade = "неудовлетворительно";
            break;
            case 3:grade = "удовлетворительно";
            break;
            case 4:grade = "хорошо";
            break;
            case 5:grade = "отлично";
            break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + grade);
    }
}
