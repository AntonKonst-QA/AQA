package Homework.Work_7.HashSet;

import java.util.HashSet;

public class Task2_SpecifiedТumber {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(24);
        num.add(35);
        num.add(10);
        num.add(51);
        num.add(1);
        num.add(18);
        num.add(32);
        num.add(26);
        num.add(29);
        num.add(55);

        int checkNum = 52;

        if (num.contains(checkNum)) {
            System.out.println("Число найдено: " + checkNum);
        } else {
            System.out.println("В списке нет заданного числа: " + checkNum);
        }

    }
}
