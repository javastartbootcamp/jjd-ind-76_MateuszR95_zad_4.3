package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(4.0);
        double squareArea = square.calculateSquareArea();
        System.out.println(squareArea);
        Rectangle rectangle = new Rectangle(3.0, 9.0);
        double rectPerimeter = rectangle.calculateRectPerimeter();
        System.out.println(rectPerimeter);
        Circle circle = new Circle(5.0);
        double circleArea = circle.calculateCircleArea();
        System.out.println(circleArea);
        Triangle triangle = new Triangle(2.9, 5.3, 7.5);
        double trianglePerimeter = triangle.calculateTrianglePerimeter();
        System.out.println(trianglePerimeter);

    }
}
