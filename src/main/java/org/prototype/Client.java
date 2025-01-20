package org.prototype;

public class Client {
    private Shape shape;
    public Client(Shape shape) {
        this.shape = shape;
    }
    public Shape getShape() {
        return shape.clone();
    }
}
