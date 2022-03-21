package day14;

import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");

        try {
            System.out.println(parseFileToObjList(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }

    public static List<Person> parseFileToObjList(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<Person> peolpe = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] person = scanner.nextLine().split(" ");

            int age = Integer.parseInt(person[1]);
            if(age < 0)
                throw new IllegalArgumentException();

            peolpe.add(new Person(person[0], age));
        }

        scanner.close();
        return peolpe;
    }
}
