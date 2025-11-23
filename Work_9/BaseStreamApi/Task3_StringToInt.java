package Homework.Work_9.BaseStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3_StringToInt {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Кошка", "Собака", "Белка", "Волк", "Медведь");
        List<Integer> length =
                list.stream()
                        .map(s -> s.length())
                        .collect(Collectors.toList());
        System.out.println("Длины сторк: " + length);
    }
}
