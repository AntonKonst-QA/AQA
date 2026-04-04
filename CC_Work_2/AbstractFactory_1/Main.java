package Practice_2.AbstractFactory_1;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new ClassicFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();

        chair.sitOn();
        table.use();
    }
}
