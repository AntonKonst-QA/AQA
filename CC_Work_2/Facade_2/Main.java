package Practice_2.Facade_2;

public class Main {
    public static void main(String[] args) {
        OpenDoor open = new OpenDoor();
        CloseDoor close = new CloseDoor();
        BlockDoor block = new BlockDoor();

        Door facade = new Door(open, close, block);
        facade.workWithDoor();
    }
}
