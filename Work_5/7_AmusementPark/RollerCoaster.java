package Homework.Work_5.AmusementPark;

public class RollerCoaster implements Attraction {

    @Override
    public String info() {
        return "Получить острые ощущения";
    }

    @Override
    public void maintain() {
        System.out.println("Необходимо провести проверку безопасности");
    }
}
