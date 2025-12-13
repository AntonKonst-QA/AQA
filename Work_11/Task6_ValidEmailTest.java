package Homework.Work_11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task6_ValidEmailTest {
    Task6_ValidEmail checker = new Task6_ValidEmail();

    // Проверить корректные ("test@example.com")
    @Test
    void testCorrectEmail() {
        assertTrue(checker.isValidEmail("test@example.com"));
    }

    // Проверить некорректные email ("bad@.com", "no-at-symbol")
    @Test
    void testUncorrectEmail() {
        assertFalse(checker.isValidEmail("bad@.com"));
        assertFalse(checker.isValidEmail("no-at-symbol"));
    }

    // Проверить null
    @Test
    void testNull() {
        assertFalse(checker.isValidEmail(null));
    }
}
