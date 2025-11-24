package Homework.Work_7.ArrayDeque;

import java.util.ArrayDeque;

public class Task2_ExtractInReverseOrder {
    public static void main(String[] args) {
        ArrayDeque<String> list = new ArrayDeque<>();
        list.push("A");
        list.push("C");
        list.push("B");
        while (!list.isEmpty()) {
            System.out.println(list.pop());
        }
    }
}
