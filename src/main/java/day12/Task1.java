package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carModels = new ArrayList<>(Arrays.asList("Audi", "Toyota", "Subaru", "BMW"));

        carModels.add(2, "Kia");
        carModels.remove(0);

        System.out.println(carModels);
    }
}
