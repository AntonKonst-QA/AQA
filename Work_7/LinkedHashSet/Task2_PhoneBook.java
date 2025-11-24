package Homework.Work_7.LinkedHashSet;

import java.util.LinkedHashSet;

public class Task2_PhoneBook {

    public static void main(String[] args) {

        LinkedHashSet<String> book = new LinkedHashSet<>();
        addUnique(book, "Владислав");
        addUnique(book, "Полина");
        addUnique(book, "Михаил");
        addUnique(book, "Полина");
        addUnique(book, "Анна");

    }

    public static void addUnique(LinkedHashSet<String> set, String element) {
            if (set.contains(element)) {
                System.out.println("Контакт " + element + " уже существует");
            }else {
                set.add(element);
            System.out.println("Контакт " + element + " добавлен");
            }
    }
}
