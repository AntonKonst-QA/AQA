package Homework.Work_7.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4_ArrayListWithSumAllInt {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int sum = 0;
        for (int number : num) {
            sum += number;
        }
        System.out.println("Сумма всех чисел: " + sum);
    }
    }
