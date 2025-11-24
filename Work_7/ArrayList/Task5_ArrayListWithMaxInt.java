package Homework.Work_7.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5_ArrayListWithMaxInt {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(100, 200, 203, 99));
        int maxNum = num.get(0);
        for (int numbers: num) {
            if (numbers > maxNum) {
                maxNum = numbers;
            }
        }System.out.println("Максимальное число: " + maxNum);
    }
}
