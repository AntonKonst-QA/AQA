package Homework.Work_7.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_ArrayListWithString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Яблоко" , "Банан", "Апельсин", "Груша"));
        String longest = "";
        for (String word: list) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        } System.out.println("Самая длинная строка: " + longest);
    }
}
