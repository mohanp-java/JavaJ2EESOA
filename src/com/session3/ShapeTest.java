package com.session3;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter an option");
            System.out.println("1 - Square");
            System.out.println("2 - Rectangle");
            System.out.println("3 - Circle");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            Shape shape = null;
            switch (input) {
                case 1 :
                    shape = new Square();
                    setColorAndCalArea(scanner, shape);
                    break;
                case 2 :
                    shape = new Rectangle();
                    setColorAndCalArea(scanner, shape);
                    break;
                case 3 :
                    shape = new Circle();
                    setColorAndCalArea(scanner, shape);
                    break;
                default:
                    System.out.println("****Program exits*****");
                    scanner.close();
                    System.exit(0);
            }
        }
    }

    private static void setColorAndCalArea(Scanner scanner, Shape shape) {
        System.out.println("Please enter a color");
        shape.setColor(scanner.next());
        System.out.println(shape.toString());
        shape.calculateArea();
        System.out.println("**************************");
    }
}
