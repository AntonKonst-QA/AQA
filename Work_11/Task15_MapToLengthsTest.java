package Homework.Work_11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task15_MapToLengthsTest {
    Task15_MapToLengths checker = new Task15_MapToLengths();

    // Проверить [ "Java", "C++", "Go" ] → [ 4, 3, 2 ]
    @Test
    void testMapToLengthsNorma() {
        List<String> input = Arrays.asList("Java", "C++", "Go");
        List<Integer> expected = Arrays.asList(4, 3, 2);

        assertEquals(expected, checker.mapToLengths(input));
    }

    // Проверить пустой список
    @Test
    void testMapToLengthsEmpty() {
        assertTrue(checker.mapToLengths(Collections.emptyList()).isEmpty());
    }

}
