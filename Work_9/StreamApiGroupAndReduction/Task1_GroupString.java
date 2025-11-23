package Homework.Work_9.StreamApiGroupAndReduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1_GroupString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Сало", "Фасоль", "Солнце", "Фонарь");
        Map<Character, List<String>> groupString =
                list.stream()
                        .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println("Группировка слов по первой букве: " + groupString);
    }
}
