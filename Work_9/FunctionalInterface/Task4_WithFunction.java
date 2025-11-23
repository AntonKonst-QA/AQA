package Homework.Work_9.FunctionalInterface;

import java.util.function.Function;

public class Task4_WithFunction {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Длина сторки: " + stringLength.apply("Привет"));
    }
}
