package com.session2;

import java.util.Scanner;

public class FunctionDemo {
    public static int square(int x) {
        return x * x;
    }
    public static void main(String[] args) {
        System.out.println("Please enter a number :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int output = FunctionDemo.square(input);
        System.out.println("Output : "+ output);
    }
}

