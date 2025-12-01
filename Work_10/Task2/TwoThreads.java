package Homework.Work_10.Task2;

public class TwoThreads {
    public static void main(String[] args) {
        Runnable printA = (() -> {
            for (int i=1; i < 5; i++) {
                System.out.println("Поток А");
                try {
                    Thread.sleep(500);
                } catch (Exception ignored) {}
            }
        });

        Runnable printB = (() -> {
            for (int i=1; i < 5; i++) {
                System.out.println("Поток B");
                try {
                    Thread.sleep(500);
                } catch (Exception ignored) {}
            }
        });
    new Thread(printA).start();
    new Thread(printB).start();
    }
}
