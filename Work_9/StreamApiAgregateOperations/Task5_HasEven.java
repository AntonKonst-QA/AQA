package Homework.Work_9.StreamApiAgregateOperations;

import java.util.Arrays;
import java.util.List;

public class Task5_HasEven {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
        boolean hasEven =
                num.stream()
                        .anyMatch(n -> n % 2 == 0);
        System.out.println("Чётное число: " + hasEven);
    }
}
