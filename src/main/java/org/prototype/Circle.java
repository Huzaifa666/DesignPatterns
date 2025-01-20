package org.prototype;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(radius);
    }

    @Override
    public Integer area() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }
}
