package Homework.Work_7.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Task1_SortData {
    public static void main(String[] args) {
        TreeMap<String, Integer> sort = new TreeMap<>();
        sort.put("Валя", 20);
        sort.put("Ксю", 35);
        sort.put("Петя", 31);
        sort.put("Коля", 18);
        sort.put("Слава", 40);

        for (Map.Entry<String, Integer> entry : sort.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
