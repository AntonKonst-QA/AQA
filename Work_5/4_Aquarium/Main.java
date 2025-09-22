package Homework.Work_5.Aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        aquarium.setCreature(new Shark());
        aquarium.showMovement();
        System.out.println();

        aquarium.setCreature(new Starfish());
        aquarium.showMovement();
        System.out.println();
    }
}
