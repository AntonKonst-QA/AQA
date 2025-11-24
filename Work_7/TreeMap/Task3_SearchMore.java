package Homework.Work_7.TreeMap;

import java.util.TreeMap;

public class Task3_SearchMore {
    public static void main(String[] args) {
        TreeMap<Integer, String> people = new TreeMap<>();
        people.put(156, "Анна");
        people.put(380, "Иван");
        people.put(294, "Елизавета");

        int id = 300;

        Integer nextId = people.higherKey(id);
        if (nextId != null) {
            System.out.println("Ближайшее большее: " + nextId + " : " + people.get(nextId));
        }else {
            System.out.println("Id не найден");
        }
    }
}
