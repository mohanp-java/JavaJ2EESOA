package com.session3;

public final class FinalDemo {
    final int x = 200;


    final void displayX() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
       //  Final variable cannot be modified
        // finalDemo.x = 230;
    }
}
