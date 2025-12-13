package Homework.Work_11;

public class Task10_ValidPhoneNumber {
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }
}
