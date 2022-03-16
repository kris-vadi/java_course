package day8;

public class Task1 {
    public static void main(String[] args) {
        String string = "0";
        long startTime1 = System.currentTimeMillis();

        for (int i = 1; i <= 20000; i++) {
            string = string + " " + i;
        }
        System.out.println(string);

        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы String, в мс.: " + (stopTime1 - startTime1));

        StringBuilder stringBuilder = new StringBuilder("0");
        long startTime2 = System.currentTimeMillis();

        for (int i = 1; i <= 20000; i++) {
           stringBuilder.append(" ").append(i);
        }
        System.out.println(stringBuilder);

        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы StringBuilder, в мс.: " + (stopTime2 - startTime2));
    }
}
