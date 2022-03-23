package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<String> peolpe = new ArrayList<>();

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                peolpe.add(line);

                String[] man = line.split(" ");
                if(Integer.parseInt(man[1]) < 0)
                    throw new IllegalArgumentException("Некорректный входной файл");
            }
            scanner.close();
            return peolpe;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
