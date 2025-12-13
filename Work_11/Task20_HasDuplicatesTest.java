package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task20_HasDuplicatesTest {
    Task20_HasDuplicates checker =new Task20_HasDuplicates();

    // Проверить [1, 2, 3, 4, 5] → false
    @Test
    void testHasDuplicatesNormal() {
        assertFalse(checker.hasDuplicates(new int[] {1, 2, 3, 4, 5}));
    }

    // Проверить [1, 2, 2, 3] → true
    @Test
    void testHasDuplicatesFalse() {
        assertTrue(checker.hasDuplicates(new int[] {1,2,2,3}));
    }

    // Проверить пустой массив → false
    @Test
    void testHasDuplicatesEmpty() {
        assertFalse(checker.hasDuplicates(new int[] {}));
    }
}
