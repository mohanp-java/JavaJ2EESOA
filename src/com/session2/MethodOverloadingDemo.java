package com.session2;

import java.util.Scanner;

public class MethodOverloadingDemo {
    public static int square(int x) {
        return  x * x;
    }

    public static int square(int x, int y) {
        return  x * x;
    }

    public static double square(double y) {
        return y * y;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number to be squared");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = MethodOverloadingDemo.square(input);
        System.out.println("Result of int square : " + result);
        System.out.println("Please enter a number to be squared");
        double input1 = scanner.nextDouble();
        double result1 = MethodOverloadingDemo.square(input1);
        System.out.println("Result of double square : " + result1);
    }
}
