package Homework.Work_5.Museum;

public class Sculpture implements Exhibit {

    @Override
    public String describe() {
        return "Скульптурный объект";
    }

    @Override
    public void preserve() {
        System.out.println("Требуется реставрация");
    }
}
