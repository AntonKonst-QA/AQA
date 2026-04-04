package Practice_2.Factory_1;

public abstract class Transportfactory{
    public abstract Transport createTransport();

    public void startTransport() {
        Transport transport = createTransport();
        transport.drive();
    }
}
