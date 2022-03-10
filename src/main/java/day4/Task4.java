package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[100];

        for (int i = 0; i < 100; i++) {
            numbers[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(numbers));

        int index = 0;
        int sum = 0;
        int maxSum = 0;

        for (int i = 0; i < 100 - 3; i++) {
            sum = numbers[i] + numbers[i+1] + numbers[i+2];
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }

        System.out.println(maxSum);
        System.out.println(index);
    }
}
