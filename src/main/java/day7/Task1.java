package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing" , 2018, 74, 440000);
        Airplane airplane2 = new Airplane("Boeing" , 2006, 77, 470000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}