package Practice_2.Facade_2;

public class Door {
    private OpenDoor open;
    private CloseDoor close;
    private BlockDoor block;

    public Door(OpenDoor open, CloseDoor close, BlockDoor block) {
        this.open = open;
        this.close = close;
        this.block = block;
    }

    public void workWithDoor() {
        open.openDoor();
        close.closeDoor();
        block.blockDoor();
    }
}
