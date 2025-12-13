package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task4_FindMaxTest {
    Task4_FindMax checker = new Task4_FindMax();

    // Проверить обычный массив ([3, 5, 7, 2])
    @Test
    void testNormalArray() {
        assertEquals(7, checker.findMax(new int []{3, 5, 7, 2}));
    }

    // Проверить один элемент в массиве
    @Test
    void testOneElement() {
        assertEquals(1, checker.findMax(new int [] {1}));
    }

    // Проверить отрицательные числа
    @Test
    void testNegativeNumber() {
        assertEquals(-2, checker.findMax(new int [] {-3, -5, -7, -2}));
    }

    // Проверить пустой массив (должно выбрасываться исключение)
    @Test
    void testEmptyArray() {
        assertThrows(Exception.class, () -> checker.findMax(new int[] {}));
    }
}
