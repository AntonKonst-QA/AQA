package Homework.Work_7.PriorityQueue;

import java.util.PriorityQueue;

public class Task1_Print {
    public static void main(String[] args) {
        PriorityQueue<Integer> num = new PriorityQueue<>();
        num.add(12);
        num.add(34);
        num.add(25);
        num.add(1);
        num.add(19);

        while (!num.isEmpty()) {
            System.out.println(num.poll());
        }

    }
}
