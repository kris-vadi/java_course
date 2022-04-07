package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        /** нужно ли было проверять входные данные, когда в условии задачи сказано, что все X и Y от 0 до 99 ??
         *  мне самой не нравится данное решение задачи, какое-то не изящное
         *  а зачем в Point переопределениы hashCode и equals? **/

        String separator = File.separator;
        File file = new File("src" + separator + "main" + separator + "resources" + separator + "taxi_cars.txt");

        Map<Integer, Point> carsCoordinates = readCoordinates(file);

        System.out.println("Введите координаты квадрата (x1 y1 x2 y2):");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        scanner.close();

        if (Math.abs(x1-x2) != Math.abs(y1-y2))
            System.out.println("Заданная фигура не является квадратом");
        else {
            System.out.println("Идентификатры машин такси, находящися внутри квадрата:");

            int count = 0;

            for (Map.Entry entry: carsCoordinates.entrySet()) {

                int x = carsCoordinates.get(entry.getKey()).getX();
                int y = carsCoordinates.get(entry.getKey()).getY();
                if (x1 < x && x < x2 && y1 < y && y < y2) {
                    System.out.println(entry.getKey());
                    count++;
                }
            }

            System.out.println("Общее количество машин в квадрате:" + count);
        }

    }

    public static Map<Integer, Point> readCoordinates(File file) {
        try {
            Scanner scanner = new Scanner(file);

            Map<Integer, Point> carsCoordinates = new HashMap<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");

                carsCoordinates.put(Integer.parseInt(numbers[0]), new Point(Integer.parseInt(numbers[1]), Integer.parseInt(numbers[2])));
            }

            scanner.close();
            return carsCoordinates;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        } //нужно ли тут ловить ошибку на случай, если в входном файле в строке будет больше, чем 3 числа? это верно или излишне?

        return null;
    }
}

