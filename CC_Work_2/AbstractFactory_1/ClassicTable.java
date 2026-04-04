package Practice_2.AbstractFactory_1;

public class ClassicTable implements Table{
    @Override
    public void use() {
        System.out.println("Стол в классическом стиле");
    }
}
