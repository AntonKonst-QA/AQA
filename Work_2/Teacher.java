package Homework.Work_2;

public class Teacher {
    String name;
    String subject;

    //Конструктор
    Teacher(String someName, String someSubject) {
        this.name = someName;
        this.subject = someSubject;
    }
    //Геттеры
    String getName() {
        return this.name;
    }
    String getSubject() {
        return this.subject;
    }
    //Сеттеры
    void setName(String newName) {
        this.name = newName;
    }
    void setSubject(String newSubject) {
        this.subject = newSubject;
    }
    //Метод
    void printInfo() {
        System.out.println("Учитель: " + this.name + "; Предмет:" + this.subject);
    }
}
