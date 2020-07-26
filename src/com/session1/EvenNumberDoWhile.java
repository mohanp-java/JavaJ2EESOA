package com.session1;

import java.util.Scanner;

public class EvenNumberDoWhile {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 0;
        System.out.println("Printing Even numbers");
        do {
            if(input < 0) {
                System.out.println("Not a valid number");
                break;
            }
            System.out.println(i);
            i = i +2;
        } while (i <= input);

    }
}
