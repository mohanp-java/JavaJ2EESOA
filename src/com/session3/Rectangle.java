package com.session3;

public class Rectangle extends Shape{
    double length = 35.56;
    double breadth = 45.676;
    @Override
    public void calculateArea() {
        System.out.println("Area of a rectangle is " + (length*breadth));
    }

    @Override
    public String toString() {
        return "Rectangle{" + "Color : " + getColor() +
                "length=" + length +
                ", breadth = " + breadth +
                '}';
    }
}
