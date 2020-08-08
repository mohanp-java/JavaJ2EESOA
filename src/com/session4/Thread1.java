package com.session4;

public class Thread1 extends  Thread{

    MultiplicationTable table;

    Thread1(MultiplicationTable table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}
