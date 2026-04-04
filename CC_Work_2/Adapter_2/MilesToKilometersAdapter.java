package Practice_2.Adapter_2;

public class MilesToKilometersAdapter implements Distance{
    public Kilometers kilometers;

    public MilesToKilometersAdapter(Kilometers kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public void translate() {
        System.out.println("Перевод единиц измерения расстояния");
        kilometers.translateToKilometers();
    }
}
