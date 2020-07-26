package com.session2;

public class VoteCalculator {
    public static void main(String[] args) {
        int[][] ints = {{126, 32, 230, 21, 200}, {152, 85, 121, 215, 13}};// 2 * 5 -> 10* 4 = 40 bytes
        //Below code assigns the value to each index similar to the previous line and hence commented
        /*//Democratic party
        ints[0][0] = 126;
        ints[0][1] = 32;
        ints[0][2] = 230;
        ints[0][3] = 21;
        ints[0][4] = 200;

        //Republic party
        ints[1][0] = 152;
        ints[1][1] = 85;
        ints[1][2] = 121;
        ints[1][3] = 215;
        ints[1][4] = 13;*/

        //Displaying matrix
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Finding the winning party");
        //Find the winning party
        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += ints[i][j];
            }
            System.out.println(sum);
        }
    }
}
