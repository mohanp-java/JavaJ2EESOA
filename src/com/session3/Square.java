package com.session3;

public class Square extends  Shape{
    double side = 25.555;


    @Override
    public void calculateArea() {
        System.out.println("Area of square : "+ (side*side));
    }

    @Override
    public String toString() {
        return "Square{" + "Color : " + getColor() +
                "side = " + side +
                '}';
    }
}
