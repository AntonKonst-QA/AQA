package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task18_GcdTest {
    Task18_Gcd checker = new Task18_Gcd();

    // Проверить 24, 36 → 12
    @Test
    void testGcdNormal() {
        assertEquals(12, checker.gcd(24, 36));
    }

    // Проверить 101, 103 → 1
    @Test
    void testGcdPrimes() {
        assertEquals(1, checker.gcd(101, 103));
    }

    // Проверить 0, 10 → 10
    @Test
    void testGcdZero() {
        assertEquals(10, checker.gcd(0, 10));
    }

}
