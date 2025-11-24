package Homework.Work_7.LinkedHashMap;

import java.util.LinkedHashMap;

public class Task1_AddElements {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> elem = new LinkedHashMap<>();
        elem.put("Четвертый", 4);
        elem.put("Первый", 1);
        elem.put("Третий", 3);
        elem.put("Второй", 2);
        elem.put("Пятый", 5);

        System.out.println("Элементы в порядке добавления: " +elem);
    }
}
