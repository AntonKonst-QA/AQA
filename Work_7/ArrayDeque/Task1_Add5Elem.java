package Homework.Work_7.ArrayDeque;

import java.util.ArrayDeque;
import java.util.TreeMap;

public class Task1_Add5Elem {
    public static void main(String[] args) {
        ArrayDeque<String> list = new ArrayDeque<>();
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");
        list.add("Четвертый");
        list.add("Пятый");

        for (String element:list) {
            System.out.println(list);
        }
    }
}
