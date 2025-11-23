package Homework.Work_9.FunctionalInterface;

import java.util.function.Predicate;

public class Task3_WithPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("Чётное число: " + isEven.test(6));
    }
}
