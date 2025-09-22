package Homework.Work_5.AmusementPark;

public class Carousel implements Attraction {

    @Override
    public String info() {
        return "Спокойный аттракцион";
    }

    @Override
    public void maintain() {
        System.out.println("Необходимо провести техническое обслуживание");
    }
}
