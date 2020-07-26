package com.session2;

public class DeclaringArrays {
    public static void main(String args[]) {
        //Way 1
        int[] a1 = new int[-5];
        //Way 2
        int a2[] = new int[5];
        //Way 3
        int[] a3 = {1, 2, 3, 4, 5};// 0 -> 1; 1 -> 2; 2 -> 3; 3 -> 4; 4 -> 5
        // Way 4
        int a4[] = new int[] {1, 2, 3, 4, 5};
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        int[] iArray = {1, 2, 3};
        char[] chars = new char[2];
    }
}
