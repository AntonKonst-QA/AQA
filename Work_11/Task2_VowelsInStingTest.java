package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task2_VowelsInStingTest {
    Task2_VowelsInSting checker = new Task2_VowelsInSting();

    // Проверка разных строк ("hello", "java", "AEIOU", "")
    @Test
    void testEmptyString() {
        assertEquals(2, checker.countVowels("hello"));
        assertEquals(2, checker.countVowels("java"));
        assertEquals(5, checker.countVowels("AEIOU"));
        assertEquals(0, checker.countVowels(""));
    }

    // Проверка null (должно выбрасываться исключение)
    @Test
    void testNull() {
       assertThrows(IllegalArgumentException.class, () -> checker.countVowels((null)));
    }

    // Проверка строк без гласных
    @Test
    void testNotVowels() {
        assertEquals(0, checker.countVowels("bcdfg"));
    }
}
