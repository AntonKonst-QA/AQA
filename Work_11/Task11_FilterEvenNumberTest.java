package Homework.Work_11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task11_FilterEvenNumberTest {
    Task11_FilterEvenNumber checker = new Task11_FilterEvenNumber();

    // Проверить обычный список ([1, 2, 3, 4, 5, 6] → [2, 4, 6])
    @Test
    void testNormalList() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expectid = Arrays.asList(2, 4, 6);

        assertEquals(expectid, checker.filterEvenNumbers(input));
    }

    // Проверить список без чётных чисел
    @Test
    void testWithoutEvent() {
        List<Integer> input = Arrays.asList(1, 3, 5);

        assertTrue(checker.filterEvenNumbers(input).isEmpty());
    }

    // Проверить пустой список
    @Test
    void testEmptyList() {
        List<Integer> input = Collections.emptyList();

        assertTrue(checker.filterEvenNumbers(input).isEmpty());
    }
}
