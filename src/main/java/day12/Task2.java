package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        addNumber(numbers,0,30);
        addNumber(numbers, 300, 350);

        System.out.println(numbers);
    }

    public static void addNumber( List<Integer> numbers, int min, int max) {
        for (int i = min; i <= max; i++) {
            numbers.add(i);
        }
    }
}
