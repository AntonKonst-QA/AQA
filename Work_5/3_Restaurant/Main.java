package Homework.Work_5.Restaurant;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Dish soup = new HotDish(80);
        Dish cola = new Drink(150);

        menu.addDish(soup);
        menu.addDish(cola);
        menu.printMenu();
    }
}
