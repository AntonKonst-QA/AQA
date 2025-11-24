package Homework.Work_7.HashSet;

import java.util.HashSet;

public class Task1_PrintNumber {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println("Содержимое списка: " + num);
    }
}
