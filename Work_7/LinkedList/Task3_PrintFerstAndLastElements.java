package Homework.Work_7.LinkedList;

import java.util.LinkedList;

public class Task3_PrintFerstAndLastElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");
        list.add("Четвертый");

        if (!list.isEmpty()) {
            System.out.println("Первый элемент: " + list.getFirst());
            System.out.println("Последний элемент: " + list.getLast());
        }


    }
}
