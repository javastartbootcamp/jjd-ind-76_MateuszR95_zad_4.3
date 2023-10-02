package pl.javastart.task;

public class Rectangle {

    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double calculateRectPerimeter() {
        double rectPerimeter = side1 * 2 + side2 * 2;
        return rectPerimeter;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }
}
