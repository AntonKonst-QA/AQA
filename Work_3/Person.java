package Homework.Work_3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    // Конструктор
    Person(String someFirstName, String someLastName, String someSsn) {
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = someSsn;
    }

    //Геттеры
    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getSsn() {
        return ssn;
    }

    // Сеттер для firstName
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    // Сеттер для lastName
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    //Метод
    void printPersonInfo() {
        System.out.println("Имя: " + this.firstName + ", Фамилия: " + this.lastName + ", SSN: " + ssn);
    }
}
