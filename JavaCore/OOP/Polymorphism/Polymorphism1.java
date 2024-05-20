package OOP.Polymorphism;

public class Polymorphism1 {
    public static void main(String[] args) {
        Square square = new Square(6);

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}
abstract class GeometricShape {
    public abstract double area();

    public abstract double perimeter();
}

class Triangle extends GeometricShape {

    private double base;
    private double height;
    private double side1;
    private double side2;
    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    public double area() {
        return (base * height) / 2;
    }
    @Override
    public double perimeter() {
        return side1 + side2 + base;
    }
}

class Square extends GeometricShape {

    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }
    @Override
    public double perimeter() {
        return 4 * side;
    }
}
