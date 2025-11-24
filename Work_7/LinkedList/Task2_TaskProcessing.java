package Homework.Work_7.LinkedList;

import java.util.LinkedList;

public class Task2_TaskProcessing {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Первая задача");
        list.add("Вторая задача");
        list.add("Третья задача");

        while (!list.isEmpty()) {
            String list1 = list.poll();
            System.out.println("Выполняется: " + list1);
        }
    }
}
