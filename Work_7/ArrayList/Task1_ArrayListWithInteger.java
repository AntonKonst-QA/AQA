package Homework.Work_7.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1_ArrayListWithInteger {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Список: " + num);
        num.add(6);
        System.out.println("Новый список: " + num);
    }
}
