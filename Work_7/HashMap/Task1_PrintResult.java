package Homework.Work_7.HashMap;

import java.util.HashMap;

public class Task1_PrintResult {
    public static void main(String[] args) {
        HashMap<String, Integer> pair = new HashMap<>();
        pair.put("Павел", 18);
        pair.put("Анна", 23);
        pair.put("Коля", 48);
        pair.put("Оля", 36);
        pair.put("Иван", 80);

        System.out.println(pair);
    }
}
