package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Kristina Vadi
 * Чичиков=608
 */

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        File file = new File("src" + separator + "main" + separator + "resources" + separator + "dushi.txt");

        countWords(file);
    }

    public static void countWords(File file) {
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[»«<>…N„“.,:;()?!\"\\s–+]");

            HashMap<String, Integer> wordsCount = new HashMap<>();

            while (scanner.hasNext()) {
                String word = scanner.next();

                if (!wordsCount.containsKey(word))
                    wordsCount.put(word, 1);
                else
                    wordsCount.put(word, wordsCount.get(word) + 1);
            }
            scanner.close();

            wordsCount.remove(""); // если убрать,то появляется пустая строка, которая встречается 38602 раза, интересно почему?

            Map<String, Integer> sortedWordsCount = sortedHashMap(wordsCount);
            System.out.println(sortedWordsCount); // Чичиков=608

            System.out.println("100 самых часто используемых слов:");
            for (int i = 0; i < 100; i++) {
                System.out.println(sortedWordsCount.keySet().toArray()[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        }
    }

    public static Map<String, Integer> sortedHashMap(HashMap<String, Integer> hashMap){
        Map<String, Integer> sortedHashMap = hashMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(LinkedHashMap::new,
                        (m, c) -> m.put(c.getKey(), c.getValue()),
                        LinkedHashMap::putAll);
        return sortedHashMap;
    }
}
