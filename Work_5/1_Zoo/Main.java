package Homework.Work_5.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.setAnimal(new Bird());
        zoo.showAnimalBehavior();
        System.out.println();

        zoo.setAnimal(new Elephant());
        zoo.showAnimalBehavior();
        System.out.println();
    }
}
