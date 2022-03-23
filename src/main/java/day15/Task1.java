package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.io.File.separator;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        File file = new File("src" + separator + "main" + separator + "resources" + separator + "shoes.csv");

        createMissingShoesFile(file);

    }

    public static void createMissingShoesFile(File file) {
        try {
            File newFile = new File("src" + separator + "main" + separator + "resources" + separator + "missing_shoes.txt");
            PrintWriter printWriter = new PrintWriter(newFile);

            if (newFile.createNewFile())
                System.out.println("Файл был создан");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] separateLine = line.split(";");

                if (separateLine.length != 3)
                    throw new IllegalArgumentException("Некорректный входной файл");

                if (separateLine[2].equals("0")) {
                    printWriter.println(line.replace(";", ","));
                }
            }

            printWriter.close ();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        } catch (IOException e) {
            System.out.println("Новый файл не был создан или уже существует");
        }

    }
}
