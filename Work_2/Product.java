package Homework.Work_2;

public class Product {
    String name;
    double price;

    //Конструктор
    Product (String someName, double somePrice) {
        this.name = someName;
        this.price = somePrice;
    }
    //Геттеры
    String getName() {
        return this.name;
    }
    double getPrice() {
        return this.price;
    }
    //Сеттер для цены
    void setPrice(double newPrice) {
        this.price = newPrice;
    }
    //Методы
    void applyDiscount(double discount) {
        price = price * (1 - discount / 100);
    }
    void printInfo() {
        System.out.println("Товар: " + this.name + "; Цена: " + this.price);
    }
}
