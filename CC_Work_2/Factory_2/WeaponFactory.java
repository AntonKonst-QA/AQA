package Practice_2.Factory_2;

public abstract class WeaponFactory {
    public abstract Weapon createWeapon();

    public void startWeapon() {
        Weapon weapon = createWeapon();
        weapon.create();
    }
}
