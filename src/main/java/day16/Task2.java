package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            File file1 = new File("file1.txt");
            File file2 = new File("file2.txt");

            try {
                if (file1.createNewFile() || file2.createNewFile());
            } catch (IOException e) {
                System.out.println("Файл не был создан");
            }

            PrintWriter printWriter1 = new PrintWriter(file1);
            PrintWriter printWriter2 = new PrintWriter(file2);

            Random random = new Random();

            for (int i = 0; i < 1000; i++) {
                int number = random.nextInt(100);
                printWriter1.print(number + " ");
            }
            printWriter1.close ();

            Scanner scanner = new Scanner(file1);
            String[] numbers = scanner.nextLine().split(" ");

            for (int i = 0; i < 1000; i += 20) {
                double sum = 0;
                for (int j = i; j < i + 20; j++) {
                    sum += Integer.parseInt(numbers[j]);
                }
                double average = sum / 20;
                printWriter2.print(average + " ");
            }
            scanner.close();
            printWriter2.close();

            printResult(file2);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        }
    }

    public static void printResult(File file) {
        try {
            Scanner scanner= new Scanner(file);
            String[] numbers = scanner.nextLine().split(" ");

            double sum =0;
            for (String number: numbers) {
                sum += Double.parseDouble(number);
            }

            scanner.close();
            System.out.println((int)sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        }

    }
}
