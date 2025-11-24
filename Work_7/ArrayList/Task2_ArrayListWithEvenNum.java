package Homework.Work_7.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2_ArrayListWithEvenNum {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        for (int number: num) {
            if (number % 2 == 0)
                System.out.println("Чётные числа: " + number);
        }
    }
}
