package Homework.Work_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task16_SplitStringTest {
    Task16_SplitString checker = new Task16_SplitString();

    // Проверить "Java,Python,C++", "," → ["Java", "Python", "C++"]
    @Test
    void testSplitStringNormal() {
        String[] input = {"Java", "Python", "C++"};
        assertArrayEquals(input, checker.splitString("Java,Python,C++",  ","));
    }

    // Проверить "", "," → [""]
    @Test
    void testSplitStringEmpty() {
        String[] input = {""};
        assertArrayEquals(input, checker.splitString("", ","));
    }

    // Проверить "word", "," → ["word"]
    @Test
    void testSplitStringNoDelimiter() {
        String[] input = {"word"};
        assertArrayEquals(input, checker.splitString("word", ","));
    }
}
