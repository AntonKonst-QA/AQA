package Homework.Work_2;

public class Book {
    String title;
    String author;

    //Конструктор
    Book (String someTitle, String someAuthor) {
        this.title = someTitle;
        this.author = someAuthor;
    }
    //Геттеры
    String getTitle() {
        return this.title;
    }
    String getAuthor() {
        return this.author;
    }
    //Сеттеры
    void setTitle(String newTitle) {
        this.title = newTitle;
    }
    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    //Метод
    void printInfo() {
        System.out.println("Автор книги: " + this.author + " Название книги: " + this.title);
    }
}
