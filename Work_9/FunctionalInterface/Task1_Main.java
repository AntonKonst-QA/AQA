package Homework.Work_9.FunctionalInterface;

public class Task1_Main {
    public static void main(String[] args) {
        Task1_FunInterface add = (a, b) -> a + b;
        Task1_FunInterface sub = (a, b) -> a - b;
        Task1_FunInterface mul = (a, b) -> a * b;
        Task1_FunInterface div = (a, b) -> a / b;

        System.out.println("Сложение: " + add.operate(2, 3));
        System.out.println("Вычитание: " + sub.operate(5, 1));
        System.out.println("Умножение: " + mul.operate(3,4));
        System.out.println("Деление: " + div.operate(10, 2));
    }
}
