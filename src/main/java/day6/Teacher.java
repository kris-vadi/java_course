package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    Random random = new Random();

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public void evaluate (String student){
        String markMatch = "";

        int mark = random.nextInt(3 + 1) + 2;

        switch (mark){
            case 2:
                markMatch = "неудовлетворительно";
                break;
            case 3:
                markMatch = "удовлетворительно";
                break;
            case 4:
                markMatch = "хорошо";
                break;
            case 5:
                markMatch = "отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student + " по предмету " + subject + " на оценку " + markMatch + ".");
    }
}
