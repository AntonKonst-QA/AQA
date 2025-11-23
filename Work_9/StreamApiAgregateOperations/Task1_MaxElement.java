package Homework.Work_9.StreamApiAgregateOperations;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task1_MaxElement {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(123, 231, 321, 132);
        int maxElem =
                num.stream()
                        .max(Comparator.naturalOrder())
                        .orElseThrow();
        System.out.println("Максимальное число: " + maxElem);
    }
}
