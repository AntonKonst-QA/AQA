package Practice_2.Factory_2;

public class Main {
    public static void main(String[] args) {
        WeaponFactory factory;
        String userChoice = "gun";

        if(userChoice.equals("sword")) {
            factory = new SwordFactory();
        } else if(userChoice.equals("bow")) {
            factory = new BowFactory();
        } else {
            factory = new GunFactory();
        }
        factory.startWeapon();
    }
}
