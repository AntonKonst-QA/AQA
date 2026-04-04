package Practice_2.Factory_2;

public class BowFactory extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }
}
