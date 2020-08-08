package com.session4;

public class MyFirstRunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("No.f of active threads : " + Thread.activeCount());
        System.out.println("Current Thread : " + Thread.currentThread());
        System.out.println("Inside MyFirstThreadDemo run method");
    }

    public static void main(String[] args) {
        MyFirstRunnableDemo myFirstRunnableDemo = new MyFirstRunnableDemo();
        Thread thread = new Thread(myFirstRunnableDemo);
        thread.start();

    }
}
