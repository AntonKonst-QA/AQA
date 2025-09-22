package Homework.Work_5.Pets;

public class Main {
    public static void main(String[] args) {
        PetManager petManager = new PetManager();

        petManager.setPet(new Dog());
        petManager.handlePet();
        System.out.println();

        petManager.setPet(new Cat());
        petManager.handlePet();
        System.out.println();
    }
}
