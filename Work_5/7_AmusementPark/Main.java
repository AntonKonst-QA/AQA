package Homework.Work_5.AmusementPark;

public class Main {
    public static void main(String[] args) {
        AmusementPark amusementPark = new AmusementPark();

        amusementPark.setAttraction(new RollerCoaster());
        amusementPark.operateAttraction();
        System.out.println();

        amusementPark.setAttraction(new Carousel());
        amusementPark.operateAttraction();
        System.out.println();
    }
}
