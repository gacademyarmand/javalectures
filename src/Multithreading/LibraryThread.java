package Multithreading;

public class LibraryThread implements Runnable{
    @Override
    public void run() {
        System.out.println("I'm getting signs from LibraryThread");
    }
}