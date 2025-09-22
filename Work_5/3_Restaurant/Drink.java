package Homework.Work_5.Restaurant;

public class Drink implements Dish {

    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    public String getDescription() {
        return "Напиток объёмом: " + volume + " ml";
    }
}
