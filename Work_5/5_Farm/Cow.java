package Homework.Work_5.Farm;

import javax.swing.text.Style;

public class Cow implements FarmAnimal {

    @Override
    public void feed() {
        System.out.println("Корова ест траву");
    }

    @Override
    public void care() {
        System.out.println("Корове требуется выпас");
    }

    @Override
    public void produce() {
        System.out.println("Корова даёт молоко");
    }
}
