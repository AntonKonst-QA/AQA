package Homework.Work_5.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish d) {
        dishes.add(d);
    }

    public void printMenu() {
        for (Dish d : dishes) {
            System.out.println(d.getDescription());
        }
    }
}
