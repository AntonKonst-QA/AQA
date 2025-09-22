package Homework.Work_5.Farm;

public class Chicken implements FarmAnimal {

    @Override
    public void feed() {
        System.out.println("Курица ест зерно");
    }

    @Override
    public void care() {
        System.out.println("Курица нуждается в кормушке");
    }

    @Override
    public void produce() {
        System.out.println("Курица несёт яйца");
    }
}
