package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task5_LeapYearTest {
    Task5_LeapYear checker = new Task5_LeapYear();

    // Проверить обычные годы
    @Test
    void testNormalYear() {
        assertFalse(checker.isLeapYear(2019));
        assertFalse(checker.isLeapYear(2021));
        assertFalse(checker.isLeapYear(2022));
    }

    // Проверить високосные (2020, 2000, 1600)
    @Test
    void testLeapYear() {
        assertTrue(checker.isLeapYear(2020));
        assertTrue(checker.isLeapYear(2000));
        assertTrue(checker.isLeapYear(1600));
    }

    // Проверить года, которые делятся на 100, но не на 400 (1900, 2100)
    @Test
    void testYearDivisible100ButNot400() {
        assertFalse(checker.isLeapYear(1900));
        assertFalse(checker.isLeapYear(2100));
    }
}
