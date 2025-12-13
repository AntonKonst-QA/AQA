package Homework.Work_11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task12_SortByLengthTest {
    Task12_SortByLength chercker = new Task12_SortByLength();

    // Проверить [ "Java", "C", "Python" ] → [ "C", "Java", "Python" ]
    @Test
    void testSortByLength() {
        List<String> input = Arrays.asList("Java", "C", "Python");
        List<String> expected = Arrays.asList("C", "Java", "Python");

        assertEquals(expected, chercker.sortByLength(input));
    }

    // Проверить одинаковые длины ([ "aa", "bb", "cc" ])
    @Test
    void testSameLength() {
        List<String> input = Arrays.asList("aa", "bb", "cc");
        List<String> expected = Arrays.asList("aa", "bb", "cc");

        assertEquals(expected, chercker.sortByLength(input));
    }

    // Проверить пустой список
    @Test
    void testEmptyList() {
        assertTrue(chercker.sortByLength(Collections.emptyList()).isEmpty());
    }


}
