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

        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file){
        try {
            Scanner scanner = new Scanner(file);
            List<Person> peolpe = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String[] person = scanner.nextLine().split(" ");

                int age = Integer.parseInt(person[1]);
                if(age < 0)
                    throw new IllegalArgumentException("Некорректный входной файл");

                peolpe.add(new Person(person[0], age));
            }

            scanner.close();
            return peolpe;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
