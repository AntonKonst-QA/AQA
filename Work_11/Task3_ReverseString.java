package Homework.Work_11;

public class Task3_ReverseString {
    public String reverse(String input) {
        if(input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
}
