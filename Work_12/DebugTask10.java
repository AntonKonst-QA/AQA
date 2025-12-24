package Homework.Work_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Код должен удалять элементы списка, но выбрасывает ConcurrentModificationException.
public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        names.removeIf(name -> name.startsWith("A"));

    }
}
