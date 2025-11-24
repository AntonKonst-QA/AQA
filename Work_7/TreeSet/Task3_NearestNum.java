package Homework.Work_7.TreeSet;

import java.util.TreeSet;

public class Task3_NearestNum {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(10);
        num.add(13);
        num.add(16);

        int target = 14;

        Integer higher = num.higher(target);
        Integer lower = num.lower(target);
        if (lower != null) {
            System.out.println("Ближайшее меньшнее значение: " + lower);
        } else {
            System.out.println("Нет ближайшего меньшего числа");
        }

        if (higher != 0) {
            System.out.println("Ближайшее большее значение: " + higher);
        } else {
            System.out.println("Нет ближайшего большего значения");
        }
    }
}
