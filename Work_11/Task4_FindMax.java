package Homework.Work_11;

import java.util.Arrays;

public class Task4_FindMax {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
