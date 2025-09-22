package Homework.Work_5.Farm;

public class Farm {
    private FarmAnimal animal;

    public void setAnimal(FarmAnimal animal) {
        this.animal = animal;
    }

    public void serviceAnimal() {
        if (animal == null) {
            System.out.println("На ферме нет животных");
        return;
        }
        animal.feed();
        animal.care();
        animal.produce();
    }
}
