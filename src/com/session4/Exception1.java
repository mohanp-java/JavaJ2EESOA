package com.session4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        int s = 10;
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        try {
            System.out.println("The value of s/r : " + (s/r));
        }
       catch(ArithmeticException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }  catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Inside the finally block");
            scanner.close();
        }
        System.out.println("Program resumes");
        System.out.println("***************");
    }
}
