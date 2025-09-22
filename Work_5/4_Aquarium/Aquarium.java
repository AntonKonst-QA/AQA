package Homework.Work_5.Aquarium;

public class Aquarium {
    private SeaCreature creature;

    public void setCreature(SeaCreature creature) {
        this.creature = creature;
    }

    public void showMovement() {
        if (creature == null) {
            System.out.println("Аквариум пуст");
            return;
        }
        creature.move();
    }
}
