package Homework.Work_2;

public class Laptop {
    String brand;
    int price;

    //Конструктор
    Laptop (String someBrand, int somePrice) {
        this.brand = someBrand;
        this.price = somePrice;
    }
    //Геттеры
    String getBrand() {
        return this.brand;
    }
    int getPrice() {
        return this.price;
    }
    //Сеттеры
    void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    void setPrice(int newPrice) {
        this.price = newPrice;
    }
    //Метод
    void printInfo() {
        System.out.println("Брэнд: " + this.brand + "; Цена: " + this.price);
    }
}
