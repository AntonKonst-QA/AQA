package Homework.Work_2;

public class Rectangle {
    double width;
    double height;

    //Конструктор
    Rectangle(double someWidth, double someHeight) {
        this.width = someWidth;
        this.height = someHeight;
    }
    //Геттреы
    double getWidth() {
        return this.width;
    }
    double getHeight() {
        return this.height;
    }
    //Сеттер для ширины
    void setWidth(double newWidth) {
        this.width = newWidth;
    }
    //Метод
    double calculateArea() {
        return width * height;
    }
    void print() {
        System.out.println("Площадь прямоугольника: " + calculateArea());
    }
}
