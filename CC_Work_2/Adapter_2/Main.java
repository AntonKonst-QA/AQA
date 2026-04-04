package Practice_2.Adapter_2;

public class Main {
    public static void main(String[] args) {
        Distance mile = new Miles();
        mile.translate();
        Kilometers kilo = new Kilometers();
        Distance adapter = new MilesToKilometersAdapter(kilo);
        adapter.translate();
    }
}
