package com.session1;

public class DayCalculator {
    public static void main(String[] args) {
        int dayOfWeek = 5;
        switch (dayOfWeek) {
            case 1 :
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3 :
                System.out.println("Its wednesday");
                break;
            case 4 :
                System.out.println("Its Thursday");
                break;
            case 5 :
                System.out.println("Its Friday");
                break;
            case 6 :
                System.out.println("Its Saturday");
                break;
            default:
                System.out.println("Its sunday");
        }
    }
}
