package Homework.Work_8.Exceptions;

public class Task2_Division {
    public static void main(String[] args) {
        divide (10, 0);
    }
    public static void divide (int a, int b) {
        try {
            int result = a/b;
            System.out.println("Результат: " +result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль невозможно!");
        }
    }
}
