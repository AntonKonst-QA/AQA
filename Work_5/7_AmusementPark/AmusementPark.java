package Homework.Work_5.AmusementPark;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void operateAttraction() {
        if (attraction == null) {
            System.out.println("Аттракционы не работают");
        return;
        }
        attraction.info();
        attraction.maintain();
    }

}
