package Homework.Work_9.StreamApiGroupAndReduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2_GroupIntByEvenness {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> even =
                num.stream()
                        .collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println("Числа сгрупписрованны: " + even);
    }
}
