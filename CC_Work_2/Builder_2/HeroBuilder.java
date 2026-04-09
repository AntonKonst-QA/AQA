package Practice_2.Builder_2;

public class HeroBuilder {
    protected String name;
    protected int half;
    protected int damage;
    protected int armor;
    protected int magic;

    public HeroBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public HeroBuilder setHalf(int half) {
        this.half = half;
        return this;
    }

    public HeroBuilder setDamage(int damage) {
        this.damage = damage;
        return  this;
    }

    public HeroBuilder setArmor(int armor) {
        this.armor = armor;
        return this;
    }

    public HeroBuilder setMagic(int magic) {
        this.magic = magic;
        return this;
    }

    public Hero build() {
        return new Hero(this);
    }
}
