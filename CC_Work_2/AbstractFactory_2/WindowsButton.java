package Practice_2.AbstractFactory_2;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("Кнопка Windows");
    }
}
