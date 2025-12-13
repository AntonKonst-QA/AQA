package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task19_JsonObjectTest {
    Task19_JsonObject checker = new Task19_JsonObject();

    // Проверить "{"key":"value"}" → true
    @Test
    void testJsonObjectNormal() {
        assertTrue(checker.isValidJson("{\"key\":\"value\"}"));
    }

    // Проверить "invalid json" → false
    @Test
    void testJsonObjectFalse() {
        assertFalse(checker.isValidJson("invalid json"));
    }

    // Проверить null → false
    @Test
    void testJsonObjectNull() {
        assertFalse(checker.isValidJson(null));
    }
}
