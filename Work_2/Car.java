package Homework.Work_2;

public class Car {
    String brand;
    int year;

    //Конструктор
    Car (String someBrand, int someYear) {
        this.brand = someBrand;
        this.year = someYear;
    }
    //Геттеры
    String getBrand() {
        return this.brand;
    }
    int getYear() {
        return this.year;
    }
    //Сеттеры
    void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    void setYear(int newYear) {
        this.year = newYear;
    }
    //Метод
    void print() {
        System.out.println("Марка авто: " + this.brand + " Год выпуска: " + this.year);
    }
}
