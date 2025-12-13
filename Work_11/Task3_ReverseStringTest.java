package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Task3_ReverseStringTest {
    Task3_ReverseString checker = new Task3_ReverseString();

    // Проверка обычной строки
    @Test
    void testNormalString() {
        assertEquals("olleh", checker.reverse("hello"));
        assertEquals("avaJ", checker.reverse("Java"));
        assertEquals("54321", checker.reverse("12345"));
    }

    // Проверка пустой строки
    @Test
    void testEmptyString() {
        assertEquals("", checker.reverse(""));
    }

    // Проверка null (должен возвращаться null)
    @Test
    void testNull() {
        assertNull(checker.reverse(null));
    }
}
