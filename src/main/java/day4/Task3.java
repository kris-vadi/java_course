package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int m = 12;
        int n = 8;
        int[][] numbers = new  int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j< n; j++) {
                numbers[i][j] = random.nextInt(50);
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        int sumLine = 0;
        int sum = 0;
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j< n; j++) {
                sumLine += numbers[i][j];
            }
            if (sumLine > sum) {
                sum = sumLine;
                index = i;
            }
            sumLine = 0;
        }
        
        System.out.println("Ответ:" + index);
    }
}
