package Homework.Work_5.Farm;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        farm.setAnimal(new Cow());
        farm.serviceAnimal();
        System.out.println();

        farm.setAnimal(new Chicken());
        farm.serviceAnimal();
        System.out.println();
    }
}
