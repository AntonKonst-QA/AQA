package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1_EvenCheckerTest {
    Task1_EvenChecker checker = new Task1_EvenChecker();

    // Проверка чётных чисел
    @Test
    void testEvenNumber() {
        assertTrue(checker.isEven(2));
        assertTrue(checker.isEven(4));
        assertTrue(checker.isEven(20));
    }

    // Проверка нечётных чисел
    @Test
    void testOddNumber() {
        assertFalse(checker.isEven(5));
        assertFalse(checker.isEven(9));
        assertFalse(checker.isEven(101));
    }

    // Проверка нулевого значения
    @Test
    void testZero() {
        assertTrue(checker.isEven(0));
    }

    // Проверка отрицательного числа
    @Test
    void testNegativeNumber() {
        assertTrue(checker.isEven(-2));
        assertTrue(checker.isEven(-4));
        assertTrue(checker.isEven(-22));
    }
}
