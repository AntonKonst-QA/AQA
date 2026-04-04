package Practice_2.AbstractFactory_2;

public interface GUIFactory {
    Button createButton();
    Window createWindow();
    Menu createMenu();
}
