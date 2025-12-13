package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task9_CountWordsTest {
    Task9_CountWords checker = new Task9_CountWords();

    // Проверить пустую строку
    @Test
    void testEmpty() {
        assertEquals(0, checker.countWords(""));
    }

    // Проверить null
    @Test
    void testNull() {
        assertThrows(NullPointerException.class, () -> checker.countWords(null));
    }

    // Проверить cтроку с несколькими пробелами
    @Test
    void testMultiSpace() {
        assertEquals(4, checker.countWords("  hello  my  friend  "));
    }
}
