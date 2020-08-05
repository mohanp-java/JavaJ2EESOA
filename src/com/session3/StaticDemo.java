package com.session3;

public class StaticDemo {
    static int y = 1000;
    static final String COMPANY_NAME = "Walmart";
    static int x;

    //Method declared as static can be invoked with class name directly.
    static void displayY() {
        System.out.println("Displaying the value of y : " + y);
    }

    /**
     * Static blocks will be called first before the constructor.
     * Static blocks are used to initialise static variables.eg. x
     * Static blocks execution depends on the order of static blocks.
     */

    static {
        System.out.println("Inside static Block");
        x = 3000;
        System.out.println("The value of x : " + x);
    }

    StaticDemo() {
        System.out.println("Inside the constructor");
    }


    public static void main(String[] args) {
        StaticDemo demo = new StaticDemo();
        y = 2000;
        System.out.println("The value of y : " + 2000);
        StaticDemo.displayY();
    }
}
