package Practice_2.Builder_2;

public class Hero {
    private String name;
    private int half;
    private int damage;
    private int armor;
    private int magic;

    public Hero(HeroBuilder builder) {
        this.name = builder.name;
        this.half = builder.half;
        this.damage = builder.damage;
        this.armor = builder.armor;
        this.magic = builder.magic;
    }

    @Override
    public String toString() {
        return "Персонаж: " + name +
                ": [Здоровье: " + half +
                ", Урон: " + damage +
                ", Броня: " + armor +
                ", Магия: " + magic + "]";
    }
}
