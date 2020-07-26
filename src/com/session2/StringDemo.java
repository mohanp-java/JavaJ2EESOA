package com.session2;

public class StringDemo {
    public static void main(String[] args) {
        String hello = "Hello ";// String literal -> Created in String Constant pool
        System.out.println(hello.charAt(1));
        System.out.println(hello.replace("o", "w"));
        System.out.println("Length of array : " + hello.length());
        String s = new String(); // new String object will be created in heap memory
        String world = "World";
        world = "Universe"; // Creates new string, String is immutable
        String hello1 = "Hello";
        String hello2 = "Hello";
        System.out.println(hello + world);
        System.out.println("Length : " + hello.length());
        System.out.println(hello.trim().equals(hello1));//true
        System.out.println(hello.trim() == hello1); // false - Because hello was created as a new String object as it has an empty space
        System.out.println(hello1.equals(hello2)); //true
    }
}
