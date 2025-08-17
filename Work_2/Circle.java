package Homework.Work_2;

public class Circle {
    double radius;

    //Конструктор
    Circle (double someRadius) {
        this.radius = someRadius;
    }
    //Геттер
    double getRadius() {
        return this.radius;
    }
    //Сеттер
    void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    //Методы
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    void print() {
        System.out.println("Площадь круга: " + calculateArea() + "; Длина окружности: " + calculateCircumference());
    }
}
