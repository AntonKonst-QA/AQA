package Homework.Work_7.HashMap;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class Task3_PrintAllPeople {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Валя", 15);
        people.put("Елена", 36);
        people.put("Арсений", 29);

        printUnderage(people);
    }

    public static void printUnderage(Map<String, Integer> map) {
        System.out.println("Пользователь младше 18 лет: ");

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " лет");
            }
        }
    }
}
