package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task7_FactorialTest {
    Task7_Factorial checker = new Task7_Factorial();

    // Проверить 0! = 1
    @Test
    void testZero() {
        assertEquals(1, checker.factorial(0));
    }

    // Проверить маленькие числа (1!, 5!, 7!)
    @Test
    void testSmallNumber() {
        assertEquals(1, checker.factorial(1));
        assertEquals(120, checker.factorial(5));
        assertEquals(5040, checker.factorial(7));
    }

    // Проверить отрицательные числа (должно выбрасываться исключение)
    @Test
    void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> checker.factorial(-1));
    }
}
