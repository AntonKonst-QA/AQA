package Homework.Work_9.StreamApiGroupAndReduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3_AverageInt {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
        double averageInt =
                num.stream()
                        .collect(Collectors.averagingInt(n -> n));
        System.out.println("Среднее значение чисел: " + averageInt);
    }
}
