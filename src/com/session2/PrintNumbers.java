package com.session2;

import java.util.Arrays;
import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        int[] ints = {10, 20, 30, 40, 50};
        int[] ints2 = {1, 2};
        // To check whether two arrays are equal(values)
        System.out.println(Arrays.equals(ints, ints2));
        int length = ints.length;
        for (int i = 0; i < length; i++) {
            System.out.println(ints[i]);
        }
        System.out.println(ints[2]);
        System.out.println(ints[5]);
    }
}
