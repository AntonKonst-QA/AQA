package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task17_IsValidPasswordTest {
    Task17_IsValidPassword checker = new Task17_IsValidPassword();

    // Проверить "Password1" → true
    @Test
    void testIsValidPasswordNormal() {
        assertTrue(checker.isValidPassword("Password1"));
    }

    // Проверить "pass" → false
    @Test
    void testIsValidPasswordFalse() {
        assertFalse(checker.isValidPassword("pass"));
    }

    // Проверить null → false
    @Test
    void testIsValidPasswordNull() {
        assertFalse(checker.isValidPassword(null));
    }
}
