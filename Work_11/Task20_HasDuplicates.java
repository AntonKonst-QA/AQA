package Homework.Work_11;

import java.util.Arrays;

public class Task20_HasDuplicates {
    public boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
    }
}
