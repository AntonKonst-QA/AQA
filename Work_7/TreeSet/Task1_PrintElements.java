package Homework.Work_7.TreeSet;

import java.util.TreeSet;

public class Task1_PrintElements {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(1);
        num.add(3);
        num.add(5);
        num.add(2);
        num.add(4);

        System.out.println("Список чисел: " + num);
    }
}
