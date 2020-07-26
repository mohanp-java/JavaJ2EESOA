package com.session1;

public class UnaryOperator {
    public static void main(String[] args) {
        int a = + 20;
        int b = -20;
        System.out.println(a++);//a -> 20
        System.out.println(++a);// a -> 22
        System.out.println(a--);// a -> 22
        System.out.println(--a);// a -> 20
        boolean flag = !true;
        System.out.println(flag);
        // Increment and Decrement Demo from slide
        int i = 10;
        i++;
        System.out.println(i); // i-> 11
        ++i; // i = 12
        System.out.println(i); // 12
        System.out.println(++i); //13
        System.out.println(i++);//13
        System.out.println(i);//14
    }
}
