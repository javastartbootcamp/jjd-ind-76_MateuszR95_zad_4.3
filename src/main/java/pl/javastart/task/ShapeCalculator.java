package pl.javastart.task;

public class ShapeCalculator {

    public double calculateSquareArea(Square square) {
        double squareArea = square.getSide() * square.getSide();
        return squareArea;
    }

    public double calculateCircleArea(Circle circle) {
        double circleArea = Math.PI * circle.getRadius() * circle.getRadius();
        return circleArea;
    }

    public double calculateTrianglePerimeter(Triangle triangle) {
        double trianglePerimeter = triangle.getSide1() + triangle.getSide2() + triangle.getSide3();
        return trianglePerimeter;
    }

    public double calculateRectPerimeter(Rectangle rectangle) {
        double rectPerimeter = 2 * rectangle.getSide1() + 2 * rectangle.getSide2();
        return rectPerimeter;
    }
}
