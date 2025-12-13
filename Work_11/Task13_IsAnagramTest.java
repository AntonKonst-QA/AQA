package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task13_IsAnagramTest {
    Task13_IsAnagram checker = new Task13_IsAnagram();

    // Проверить "listen", "silent" → true
    @Test
    void testAnagramTrue() {
        assertTrue(checker.isAnagram("listen", "silent"));
    }

    // Проверить "java", "python" → false
    @Test
    void testAnagramFalse() {
        assertFalse(checker.isAnagram("java", "python"));
    }

    // Проверить null → false
    @Test
    void testAnagramNull() {
        assertFalse(checker.isAnagram(null, "java"));
    }
}
