package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

        int n = numbers.length;

        System.out.println(recursionSum(numbers, n));

    }

    public static int recursionSum(int[] numbers, int n) {
        if (n == 0) return numbers[0];
        n = n - 1;
        return numbers[n] + recursionSum(numbers, n);
    }
}
