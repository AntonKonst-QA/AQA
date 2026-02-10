package Work6_LSP.Before;

public class Bird {
    public void fly() {
        System.out.println("Птица летит");
    }
}
class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Пингвины не летают");
    }
}
