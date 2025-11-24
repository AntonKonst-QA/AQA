package Homework.Work_7.TreeMap;

import java.util.TreeMap;

public class Task2_MinAndMaxKey {
    public static void main(String[] args) {
        TreeMap<String, Integer> val = new TreeMap<>();
        val.put("Анна", 18);
        val.put("Виктор", 26);
        val.put("Петя", 64);

        String minKey = val.firstKey();
        String maxKey = val.lastKey();

        System.out.println("Минимальное значение: " + minKey);
        System.out.println("Максимальное значение: " + maxKey);
    }
}
