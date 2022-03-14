package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

//        String string = "0";
//        for (int i = 1; i <= 20000; i++) {
//            string = string + " " + Integer.toString(i);
//        }
//        System.out.println(string);

        StringBuilder stringBuilder = new StringBuilder("0");
        for (int i = 1; i <= 20000; i++) {
           stringBuilder.append(" ");
           stringBuilder.append(Integer.toString(i));
        }
        System.out.println(stringBuilder);

        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
    }
}
