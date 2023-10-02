package pl.javastart.task;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateSquareArea() {
        double squareArea = side * side;
        return squareArea;
    }

    public double getSide() {
        return side;
    }
}
