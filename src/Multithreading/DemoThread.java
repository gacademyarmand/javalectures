package Multithreading;

public class DemoThread {
    public static void main(String[] args) {
        FeeThread feeThread = new FeeThread();
        feeThread.start(); //asking office boy to get water
        // feeThread.run();//it will runn on the main thread

        LibraryThread libraryThread = new LibraryThread();
        Thread libThread = new Thread(libraryThread);
        libThread.start();

    }
}
