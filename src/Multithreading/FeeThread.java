package Multithreading;

public class FeeThread extends Thread {
    public FeeThread(String ftName) {
        super(ftName);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName());
        System.out.println("Fee dept sign-- no dues");
    }
}
