package Homework.Work_9.BaseStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5_DelDuplicate {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2, 2, 3, 4, 5, 5, 1);
        List<Integer> delDuplicates =
                num.stream()
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println("Числа без дубликатов: " + delDuplicates);
    }
}
