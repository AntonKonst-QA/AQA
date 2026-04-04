package Practice_2.AbstractFactory_1;

public class ClassicFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
