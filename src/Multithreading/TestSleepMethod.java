package Multithreading;

public class TestSleepMethod extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i < 5; i++) {
            // the thread will sleep for the 500 milli seconds
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}