package Homework.Work_5.Museum;

public class Manuscript implements Exhibit {

    @Override
    public String describe() {
        return "Нанесён древний текст";
    }

    @Override
    public void preserve() {
        System.out.println("Требуется контролируемая влажность");
    }
}
