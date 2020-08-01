package com.session3;

public class ConstructorDemo {
    String name;
    int regNo;
    String designation;

    public void attendClasses(String name) {
        System.out.println(name + "is attending classes");
    }

    public void doAssignment(String name) {
        System.out.println(name + "completed the assignment");
    }

    public void submitFeedback(String name) {
        System.out.println(name + "submitted the feedback");
    }

    public ConstructorDemo(int regNo) {
        System.out.println("Inside constructor 1");
        this.regNo = regNo;
    }

    ConstructorDemo() {

    }

    ConstructorDemo(int regNo, String name) {
        this(regNo);
        System.out.println("Inside Constructor 2");
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorDemo demo = new ConstructorDemo(1000);
        System.out.println(demo.regNo);
        ConstructorDemo demo1 = new ConstructorDemo(2000, "Amirtha");
        System.out.println(demo1.regNo);
        System.out.println(demo1.name);

    }
}
