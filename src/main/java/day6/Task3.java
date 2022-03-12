package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher( "Sergey", "Computer science");
        Student student = new Student("Kristina");

        teacher.evaluate(student.getName());
    }
}
