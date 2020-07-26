package com.session1;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i <= input; i++) {
            System.out.println(i);
        }
    }
}
