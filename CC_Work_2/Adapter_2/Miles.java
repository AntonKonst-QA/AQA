package Practice_2.Adapter_2;

public class Miles implements Distance{
    @Override
    public void translate() {
        System.out.println("Расстояние в милях");
    }
}
