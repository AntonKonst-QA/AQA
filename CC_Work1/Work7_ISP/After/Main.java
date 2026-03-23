package Work7_ISP.After;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Robot robot = new Robot();

        programmer.work();
        programmer.eat();
        System.out.println();
        robot.work();
    }
}
