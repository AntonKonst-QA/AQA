package Homework.Work_7.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Task2_PhoneBook {
    public static void main(String[] args) {
        LinkedHashMap<String, String> book = new LinkedHashMap<>();
        book.put("Анна", "1");
        book.put("Василий", "2");
        book.put("Юлия", "3");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        if (book.containsKey(name)) {
            System.out.println("Номер " + name + " : " + book.get(name));
        } else {
            System.out.println("Контакт не найден");
        }

    }
}
