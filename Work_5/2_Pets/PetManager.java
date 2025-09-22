package Homework.Work_5.Pets;

public class PetManager {
    private Pet pet;

    public void setPet (Pet pet) {
        this.pet = pet;
    }

    public void handlePet() {
        if (pet == null) {
            System.out.println("Домашних питомцев нет");
            return;
        }
        pet.feed();
        pet.interact();
    }
}
