package Homework.Work_7.ArrayDeque;

import java.util.ArrayDeque;

public class Task3_ExtractionOfElements {
    public static void main(String[] args) {
        ArrayDeque<String> list = new ArrayDeque<>();
        list.addFirst("Начало-1");
        list.addFirst("Начало-2");
        list.addLast("Конец-1");
        list.addLast("Конец-2");

        System.out.println("Список: " + list);
        System.out.println("Извлекаем сначала: " + list.removeFirst());
        System.out.println("Извлекаем сконца: " + list.removeLast());
    }
}
