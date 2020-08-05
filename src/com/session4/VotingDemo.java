package com.session4;

public class VotingDemo {
    public static void main(String[] args)  {
        int age = 17;
        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
        System.out.println("Program is still on !!!");
    }

    private static void validateAge(int age) throws InvalidAgeException {
        if(age < 18) {
            // Exception should be handled either with try-catch block or adding throws in method declaration.
            /*try {
                throw new InvalidAgeException("You are not eligible to vote!!");
            } catch (InvalidAgeException e) {
                e.printStackTrace();
            }*/
            throw new InvalidAgeException("You are not eligible to vote!!");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }
}
