package Practice_2.Factory_1;

public class BicycleFactory extends Transportfactory{
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
