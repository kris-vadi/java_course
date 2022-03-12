package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing" , 2018, 74.5, 440000);

        airplane.setYear(2020);
        airplane.setLength(76.3);

        airplane.fillUp(50.5);
        airplane.fillUp(100);

        airplane.info();
    }
}
