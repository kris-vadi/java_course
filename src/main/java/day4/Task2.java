package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[100];

        for (int i = 0; i < 100; i++) {
            numbers[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.toString(numbers));

        int max = 0;
        int min = 10000;
        int countEndZero = 0;
        int sum = 0;

        for (int number:numbers) {
            if (number > max) max = number;
            if (number < min) min = number;
            if (number % 10 == 0) {
                countEndZero++;
                sum += number;
            }
        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countEndZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
