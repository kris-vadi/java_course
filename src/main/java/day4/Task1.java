package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введи размерность массива:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        int countEight =0;
        int countOne = 0;
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;

        for (int number: numbers) {
            number = random.nextInt(10);

            if (number > 8) countEight++;
            if (number == 1) countOne++;

            if (number % 2 == 0) countEven++;
            if (number % 2 != 0) countOdd++;

            sum += number;

            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println(" Длина массива: " + n);
        System.out.println(" Количестве чисел больше 8: " + countEight);
        System.out.println(" Количестве чисел равных 1: " + countOne);
        System.out.println(" Количестве четных чисел: " + countEven);
        System.out.println(" Количестве нечетных чисел: " + countOdd);
        System.out.println(" Сумме всех элементов массива: " + sum);
    }
}
