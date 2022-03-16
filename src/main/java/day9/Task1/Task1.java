package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Kristina", "Java Marathon 2022");
        Teacher teacher = new Teacher("Sergey", "Java");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
