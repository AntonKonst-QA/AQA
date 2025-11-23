package Homework.Work_9.StreamApiAgregateOperations;

import java.util.Arrays;
import java.util.List;

public class Task3_SumAllelements {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2, 3, 8, 9, 15);
        int sumAllElements =
                num.stream()
                        .mapToInt(n -> n)
                        .sum();
        System.out.println("Сумма всех числе: " + sumAllElements);
    }
}
