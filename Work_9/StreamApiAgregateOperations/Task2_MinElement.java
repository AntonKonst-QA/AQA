package Homework.Work_9.StreamApiAgregateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2_MinElement {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(0, 1, 321 ,456, 8);
        int min =
                num.stream()
                        .min(Comparator.naturalOrder())
                        .orElse(2);
    System.out.println("Минимальное число: " + min);
    }
}
