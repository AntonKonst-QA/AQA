package Practice_2.Factory_2;

public class SwordFactory extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
