package Homework.Work_9.BaseStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1_FilterString {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("Яблоко", "Груша", "Дыня", "Арбуз", "Виноград");
        List<String> filterStr =
                string.stream()
                        .filter(s -> s.length() > 5)
                        .collect(Collectors.toList());
        System.out.println("Строки длиной больше 5 символов: " + filterStr);
    }
}
