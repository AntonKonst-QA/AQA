package Homework.Work_8.Exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidEmailException extends RuntimeException {
    public InvalidEmailException (String message) {
        super (message);
    }
}

public class Task4_CheckEmail {
    public static void main(String[] args) {

        try {
            validateEmail("test@mail.com");
            validateEmail("invalid-email");
        } catch (InvalidEmailException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void validateEmail (String email) {
        Pattern pattern = Pattern.compile("^[\\w,-]+@[\\w.-]+\\.[a-z]{2,}$");
        Matcher matcher = pattern.matcher(email);
       if (!matcher.matches()) {
           throw new InvalidEmailException("Неверный формат email: " + email);
       }
      System.out.println("Email корректный: " + email);
    }
}
