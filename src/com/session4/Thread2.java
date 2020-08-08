package com.session4;

public class Thread2 extends Thread{

    MultiplicationTable multiplicationTable;

    Thread2(MultiplicationTable table) {
        this.multiplicationTable = table;
    }

    @Override
    public void run() {
        multiplicationTable.printTable(10);
    }

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        Thread1 thread1 = new Thread1(multiplicationTable);
        Thread2 thread2 = new Thread2(multiplicationTable);
        thread1.start();
        thread2.start();
    }
}
