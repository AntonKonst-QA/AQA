package Homework.Work_9.BaseStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4_NumSquare {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2, 3, 4, 5, 6);
        List<Integer> numSqr =
                num.stream()
                        .map(n -> n * n)
                        .collect(Collectors.toList());
        System.out.println("Квадраты чисел: " + numSqr);
    }
}
