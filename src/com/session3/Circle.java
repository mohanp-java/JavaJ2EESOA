package com.session3;

public class Circle extends Shape {
    double radius = 28.999;
    @Override
    public void calculateArea() {
        System.out.println("Area of Circle : " + (Math.PI*radius*radius));
    }

    @Override
    public String toString() {
        return "Circle{" + "Color : " + getColor()+
                "radius = " + radius +
                '}';
    }
}
