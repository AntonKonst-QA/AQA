package Practice_2.Facade_1;

public class SmartHome {
    private Light light;
    private AirCondition air;
    private SecuritySystem security;

    public SmartHome(Light light, AirCondition air, SecuritySystem security) {
        this.light = light;
        this.air = air;
        this.security = security;
    }

    public void leaveHome() {
        light.lightOff();
        air.conditionOff();
        security.securOn();
    }
}
