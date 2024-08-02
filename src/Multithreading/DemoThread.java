package Multithreading;

public class DemoThread {
    public static void main(String[] args) {
        FeeThread feeThread = new FeeThread("ft");
        feeThread.start(); //asking office boy to get water
        // feeThread.run();//it will runn on the main thread

        LibraryThread libraryThread = new LibraryThread();
        Thread libThread = new Thread(libraryThread,"libt");
        libThread.start();

        TestSleepMethod t1=new TestSleepMethod();
        TestSleepMethod t2=new TestSleepMethod();

        t1.start();
        t2.start();

    }
}
