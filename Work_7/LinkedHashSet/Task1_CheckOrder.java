package Homework.Work_7.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Task1_CheckOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> list = new LinkedHashSet<>();
        list.add("1");
        list.add("3");
        list.add("2");
        list.add("5");
        list.add("4");

        for (String check: list) {
            System.out.println(check);
        }
    }
}
