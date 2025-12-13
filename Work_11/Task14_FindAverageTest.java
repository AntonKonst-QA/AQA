package Homework.Work_11;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task14_FindAverageTest {
    Task14_FindAverage checker = new Task14_FindAverage();

    // Проверить [1, 2, 3, 4, 5] → 3.0
    @Test
    void testFindAverageNormal() {
        assertEquals(3.0, checker.findAverage(new int[] {1, 2, 3, 4, 5}));
    }

    // Проверить [10] → 10.0
    @Test
    void testFindAverageSingle() {
        assertEquals(10.0, checker.findAverage(new int[] {10}));
    }

    // Проверить Пустой массив (должно выбрасываться исключение)
    @Test
    void testFindeAverageEmpty() {
        assertThrows(NoSuchElementException.class,
                () -> checker.findAverage(new int[] {}));
    }
}
