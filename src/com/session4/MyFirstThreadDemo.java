package com.session4;

public class MyFirstThreadDemo extends Thread{
    /**
     * In case of intellij, please debug to get the actual thread count. In run mode, the count will be +1
     */
    @Override
    public void run() {
        System.out.println("No.f of active threads : " + Thread.activeCount());
        System.out.println("Current Thread : " + Thread.currentThread());
        System.out.println("Inside MyFirstThreadDemo run method");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        System.out.println("No.f of active threads : " + Thread.activeCount());
        MyFirstThreadDemo threadDemo = new MyFirstThreadDemo();
        threadDemo.setPriority(10);
        threadDemo.setName("Thread -1 ");
        threadDemo.start();
        System.out.println("No.f of active threads : " + Thread.activeCount());
        System.out.println("Current Thread : " + Thread.currentThread());
    }
}
