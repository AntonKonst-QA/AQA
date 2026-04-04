package Practice_2.Factory_1;

public class Main {
    public static void main(String[] args) {
        Transportfactory factory;
        String userChoice = "car";

        if(userChoice.equals("car")) {
            factory = new CarFactory();
        } else {
            factory = new BicycleFactory();
        }
        factory.startTransport();
    }
}
