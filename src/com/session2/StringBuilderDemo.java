package com.session2;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();// Default capacity - 16
        StringBuilder sb3 = new StringBuilder(20);
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb1 = new StringBuilder("World");
        System.out.println(sb.append(sb1));
    }
}
