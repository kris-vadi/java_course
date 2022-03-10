package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (count < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            count++;

            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Деление на 0");
                continue;
            }

        }

    }
}
