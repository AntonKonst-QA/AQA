package Homework.Work_8.Exceptions;

class InvalidAgeException  extends Exception{
    public InvalidAgeException (String message) {
        super(message);
    }
}
public class Task3_CheckAge {
    public static void main(String[] args) {
        try {
            checkAge(151);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
    }
    public static void checkAge (int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException ("Недопустимый возраст: " + age);
        } else {
            System.out.println("Возраст корректный: " + age);
        }
    }
}