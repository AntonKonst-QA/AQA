package Homework.Work_7.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task5_ListIterator {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");

        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

    }

}
