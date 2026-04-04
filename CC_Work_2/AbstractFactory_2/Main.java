package Practice_2.AbstractFactory_2;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new MacFactory();
        Button button = factory.createButton();
        Window window = factory.createWindow();
        Menu menu = factory.createMenu();

        button.click();
        window.draw();
        menu.click();
    }
}
