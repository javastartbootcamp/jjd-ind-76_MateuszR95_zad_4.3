package pl.javastart.task;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircleArea() {
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    public double getRadius() {
        return radius;
    }
}
