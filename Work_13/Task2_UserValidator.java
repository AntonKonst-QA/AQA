package Homework.Work_13;

class InvalidUserException extends RuntimeException {
    public InvalidUserException(String message) {
        super(message);
    }
}

class UserData {
    private String name;
    private int age;
    private String email;

    public UserData(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}

public class Task2_UserValidator {
    public static boolean validationEnable = true;

    public static void validate(UserData user) {
        if (!validationEnable) return;

        if (user.getName() == null || user.getName().isEmpty() || !Character.isUpperCase(user.getName().charAt(0))) {
            throw new InvalidUserException("Invalid Name");
        }

        if (user.getAge() < 18 || user.getAge() > 100) {
            throw new InvalidUserException("Invalid age");
        }

        if (user.getEmail() == null || !user.getEmail().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            throw new InvalidUserException("Invalid email");
        }
    }
}
