package Practice_2.Factory_1;

public class CarFactory extends Transportfactory{
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
