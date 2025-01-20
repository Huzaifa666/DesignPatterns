package org.prototype;

public class Rectangle implements Shape {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(width, height);
    }

    @Override
    public Integer area() {
        return this.width * this.height;
    }
}
