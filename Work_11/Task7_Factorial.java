package Homework.Work_11;

public class Task7_Factorial {
    public int factorial(int n) {
        if(n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}
