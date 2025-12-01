package Homework.Work_10.Task1;

public class OneThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i=1; i < 5; i++) {
                System.out.println("Привет из потока!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
