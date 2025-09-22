package Homework.Work_5.BotanicalGarden;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();

        botanicalGarden.setPlant(new Orchid());
        botanicalGarden.maintainPlant();
        System.out.println();

        botanicalGarden.setPlant(new Cactus());
        botanicalGarden.maintainPlant();
        System.out.println();
    }
}
