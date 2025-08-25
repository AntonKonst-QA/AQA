package Homework.Work_3;

import java.util.Set;

public class LibraryTest {
    public static void main(String[] args) {
        Library book = new Library();
        book.setBookTitle("Арбуз");
        book.setAuthor("Джэк Рассел");
        book.setyear(2025);
        book.setCategory("Фантастика");

        System.out.println(book.getBookTitle() + ", " + book.getAuthor() + ", " + book.getYear() + ", " + book.getCategory());
    }
}
