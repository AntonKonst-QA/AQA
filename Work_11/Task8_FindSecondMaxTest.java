package Homework.Work_11;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task8_FindSecondMaxTest {
    Task8_FindSecondMax checker = new Task8_FindSecondMax();

    // Проверить обычные массивы
    @Test
    void testNormalArray() {
        assertEquals(5, checker.findSecondMax(new int[] {3, 5, 7, 2}));

    }

    // Проверить массив с одинаковыми числами
    @Test
    void testAllEqual() {
        assertThrows(NoSuchElementException.class, () -> checker.findSecondMax(new int[] {4, 4, 4, 4}));
    }

    // Провеить один элемент в массиве (должно выбрасываться исключение)
    @Test
    void testOneElement() {
        assertThrows(Exception.class, () -> checker.findSecondMax(new int[] {8}));
    }
}
