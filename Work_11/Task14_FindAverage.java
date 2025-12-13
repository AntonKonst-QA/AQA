package Homework.Work_11;

import java.util.Arrays;

public class Task14_FindAverage {
    public double findAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElseThrow();
    }
}
