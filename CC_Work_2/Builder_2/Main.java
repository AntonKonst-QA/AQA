package Practice_2.Builder_2;

public class Main {
    public static void main(String[] args) {
        Hero hero = new HeroBuilder()
                .setName("Иван")
                .setHalf(100)
                .setDamage(40)
                .setArmor(10)
                .setMagic(50)
                .build();

        System.out.println(hero);
    }
}
