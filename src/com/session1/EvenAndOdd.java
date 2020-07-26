package com.session1;

public class EvenAndOdd {
    public static void main(String[] args) {
        int input = 20;
        int i = 0;
        System.out.println("Printing Even numbers");
        while (i <= input) {
            System.out.println(i);
            i = i +2;
        }
        System.out.println("Printing Odd numbers");
        i = 1;
        while (i <= input) {
            System.out.println(i);
            i = i +2;
        }
    }
}
