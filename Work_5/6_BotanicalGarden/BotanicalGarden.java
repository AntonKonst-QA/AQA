package Homework.Work_5.BotanicalGarden;

public class BotanicalGarden {
    private Plant plant;

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public void maintainPlant() {
        if (plant == null) {
            System.out.println("В ботаническом саду нет растений");
        return;
        }
        plant.care();

    }
}
