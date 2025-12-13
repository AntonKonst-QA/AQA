package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task10_ValidPhoneNumberTest {
    Task10_ValidPhoneNumber checker = new Task10_ValidPhoneNumber();

    // Проверить корректные номера ("+1 1234567890")
    @Test
    void testCorrectNumber() {
        assertTrue(checker.isValidPhoneNumber("+1 1234567890"));
    }

    // Проверить некорректные номера ("12345", "invalid")
    @Test
    void testUncorrectNumber() {
        assertFalse(checker.isValidPhoneNumber("12345"));
        assertFalse(checker.isValidPhoneNumber("invalid"));
    }
}
