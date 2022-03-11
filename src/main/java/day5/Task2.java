package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike("Honda", "Red", 2006);

        System.out.println("Модель матоцикла: " + moto.getModel());
        System.out.println("Цвет матоцикла: " + moto.getColor());
        System.out.println("Год выпуска матоцикла: " + moto.getYear());

    }
}
