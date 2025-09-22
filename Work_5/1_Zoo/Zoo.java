package Homework.Work_5.Zoo;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void showAnimalBehavior () {
        if (animal == null) {
            System.out.println("В зоопарке нет животных");
            return;
        }
        animal.makeSound();
        animal.move();
    }
}
