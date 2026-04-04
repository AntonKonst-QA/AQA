package Practice_2.Factory_2;

public class Gun implements Weapon{
    @Override
    public void create() {
        System.out.println("Пистолет создан");
    }
}
