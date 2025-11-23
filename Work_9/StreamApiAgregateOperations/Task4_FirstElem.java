package Homework.Work_9.StreamApiAgregateOperations;

import java.util.Arrays;
import java.util.List;

public class Task4_FirstElem {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Банан", "Яблока", "Бритва", "Ананас");
        String firstElem =
                list.stream()
                        .filter(s -> s.startsWith("Б"))
                        .findFirst()
                        .orElse("Нет совпадений");
        System.out.println("Слова на букву Б: " + firstElem);

    }
}
