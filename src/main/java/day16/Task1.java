package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String[] numbers = scanner.nextLine().split(" ");

            double sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }

            double average = sum / numbers.length;

            System.out.println(average);
            System.out.printf("%.3f", average);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}

