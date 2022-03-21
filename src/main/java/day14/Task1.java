package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersLine = line.split(" ");

            int[] numbers = new int[10];
            int i = 0;
            int sum = 0;
            for (String number : numbersLine) {
                numbers[i] = Integer.parseInt(number);
                sum += numbers[i];
                i++;
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
