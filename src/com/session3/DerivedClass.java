package com.session3;

public class DerivedClass extends  BaseClass{

    DerivedClass() {
        System.out.println("Inside derived class constructor");
    }

    @Override
    public void displayX() {
        System.out.println("Inside DerivedClass display method");
    }

    public static void main(String[] args) {
        BaseClass child = new DerivedClass();
        System.out.println(child.x);
        child.displayX();
    }
}
