package Homework.Work_10.Task3;

public class UseVolatile {
    private static volatile boolean stop = false;

    public static void main(String[] args) {
        Thread counterThread = new Thread(() -> {
            long counter = 0;
            while (!stop) {
                counter ++;
            }
            System.out.println("Счетчик остановлен, counter = " + counter);
        });

        counterThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop = true;
    }
}
