package Homework.Work_11;

public class Task18_Gcd {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
