package Homework.Work_7.TreeSet;

import java.util.TreeSet;

public class Task2_NoDublicates {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(2);
        num.add(4);
        num.add(3);

        System.out.println("Спсиок чисел: " + num);
    }
    public static void addNewNum(TreeSet<Integer> set, int num) {
        if (set.add(num)) {
            System.out.println("Число " + num + " добавлено");
        } else {
                System.out.println("Число " + num + " уже существует");
        }
    }

}
