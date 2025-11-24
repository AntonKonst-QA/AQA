package Homework.Work_7.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task2_CheckName {
    public static void main(String[] args) {
        HashMap<String,Integer> people = new HashMap<>();
        people.put("Анна", 54);
        people.put("Михаил", 19);
        people.put("Антон", 38);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");

        String name = scanner.nextLine();
        if (people.containsKey(name)) {
            System.out.println(name + " найдено, возраст: " + people.get(name));
        }else {
            System.out.println("Имя " + name + " не найдено");
        }
    }
}
