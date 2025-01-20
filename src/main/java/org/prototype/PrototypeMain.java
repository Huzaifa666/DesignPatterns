package org.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Shape circle = new Circle(20);
        Shape rectangle = new Rectangle(20, 20);

        Client circleClient = new Client(circle);
        Client rectangleClient = new Client(rectangle);

        System.out.println(circleClient.getShape().area());
        System.out.println(rectangleClient.getShape().area());
    }
}
