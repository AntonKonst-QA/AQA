package Homework.Work_5.Pets;

public class Dog implements Pet {

    @Override
    public void feed() {
        System.out.println("Собака ест сухой корм");
    }

    @Override
    public void interact() {
        System.out.println("Собака гуляет");
    }
}
