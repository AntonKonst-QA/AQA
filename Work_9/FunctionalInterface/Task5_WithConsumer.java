package Homework.Work_9.FunctionalInterface;

import java.util.function.Consumer;

public class Task5_WithConsumer {
    public static void main(String[] args) {
        Consumer<String> str = s -> System.out.println(s);
        str.accept("Привет");
    }
}