package Homework.Work_11;

public class Task2_VowelsInSting {
    public int countVowels(String input) {
        if(input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
