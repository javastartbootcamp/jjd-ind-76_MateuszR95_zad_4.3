package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(4.0);
        Rectangle rectangle = new Rectangle(3.0, 9.0);
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(2.9, 5.3, 7.5);
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double squareArea = shapeCalculator.calculateSquareArea(square);
        System.out.println("Pole kwadratu wynosi: " + squareArea);
        double rectPerimeter = shapeCalculator.calculateRectPerimeter(rectangle);
        System.out.println("Obwód prostokąta wynosi: " + rectPerimeter);
        double circleArea = shapeCalculator.calculateCircleArea(circle);
        System.out.println("Pole koła wynosi: " + circleArea);
        double trianglePerimeter = shapeCalculator.calculateTrianglePerimeter(triangle);
        System.out.println("Obwód trojkąta wynosi: " + trianglePerimeter);

    }
}
