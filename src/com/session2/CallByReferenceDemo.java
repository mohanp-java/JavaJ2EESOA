package com.session2;

public class CallByReferenceDemo {
    int data = 20;

    public void changeData(CallByReferenceDemo obj) {
        obj.data = 22;
    }

    public static void main(String[] args) {
        CallByReferenceDemo callByReferenceDemo = new CallByReferenceDemo();
        System.out.println("Before calling changeData : " + callByReferenceDemo.data);
        callByReferenceDemo.changeData(callByReferenceDemo);
        System.out.println("After calling changeData : " + callByReferenceDemo.data);
    }

}
