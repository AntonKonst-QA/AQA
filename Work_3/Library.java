package Homework.Work_3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    //Геттеры
    String getBookTitle() {
        return bookTitle;
    }

    String getAuthor() {
        return author;
    }

    int getYear() {
        return year;
    }

    String getCategory() {
        return category;
    }

    //Сеттеры

    void setBookTitle(String newBookTitle) {
        this.bookTitle = newBookTitle;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    void setyear(int newYear) {
        this.year = newYear;
    }
    void setCategory(String newCategory) {
        this.category = newCategory;
    }
}
