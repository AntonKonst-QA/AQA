package Practice_2.Facade_1;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        AirCondition air = new AirCondition();
        SecuritySystem security = new SecuritySystem();

        SmartHome facade = new SmartHome(light, air, security);
        facade.leaveHome();

    }
}
