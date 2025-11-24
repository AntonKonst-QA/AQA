package Homework.Work_7.HashSet;

import java.util.*;

public class Task3_NoDuplicates {
    public static Set<String> removeDuplicates(List<String> input) {
        return new HashSet<String>(input);
    }
    public static void main(String[] args) {
    List<String> names = Arrays.asList("Анна", "Петр", "Екатерина", "Анна", "Василий", "Василий");
    Set<String> uniqueNames = removeDuplicates(names);

    System.out.println("Список имен без дубликатов: " + uniqueNames);

    }
}
