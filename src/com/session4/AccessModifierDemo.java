package com.session4;

public class AccessModifierDemo {
    private static int z = 400;
    static  int b = 30;//default
    protected static  String someName = "I am protected";
    public static float aFloat = 45.5f;

    public static void main(String[] args) {
        System.out.println("Private variable" + z);
    }
}
