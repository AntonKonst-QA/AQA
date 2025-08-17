package Homework.Work_2;

public class Point {
    double x;
    double y;

    //Конструктор
    Point (double someX, double someY) {
        this.x = someX;
        this.y = someY;
    }
    //Геттреы
    double getX() {
        return this.x;
    }
    double getY() {
        return  this.y;
    }
    //Сеттер для х
    void setX(double newX) {
        this.x = newX;
    }
    //Метод
    void print() {
        System.out.println("Координаты x: " + this.x + " Координаты y: " + this.y);
    }
}
