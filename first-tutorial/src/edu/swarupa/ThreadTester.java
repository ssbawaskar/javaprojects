package edu.swarupa;

class MyRunnable implements Runnable {
    public void run() {
        domore();
    }

    void domore() {
        System.out.println("hiii in run");
    }

}

public class ThreadTester {
    public static void main(String[] args) {
        Runnable tj = new MyRunnable();
        Thread mt = new Thread(tj);
        mt.start();
        System.out.println("back in main !!");
    }
}
