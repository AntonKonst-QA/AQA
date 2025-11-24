package Homework.Work_7.LinkedList;

import java.util.LinkedList;

public class Task4_SumOfInteger {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        int sum = 0;

        for (int number: num) {
            sum += number;
        }
        System.out.println("Сумма элементов списка: " + sum);
    }
}
