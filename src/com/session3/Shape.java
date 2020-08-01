package com.session3;

public abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void calculateArea();

    @Override
    public String toString() {
       return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
