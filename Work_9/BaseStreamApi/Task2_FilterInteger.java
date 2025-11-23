package Homework.Work_9.BaseStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2_FilterInteger {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(3, 5, 9, 10, 21, 20);
        List<Integer> filterInt =
                num.stream()
                        .filter(n -> n % 5 == 0)
                        .collect(Collectors.toList());
        System.out.println("Числа кратные 5: " + filterInt);
    }
}
