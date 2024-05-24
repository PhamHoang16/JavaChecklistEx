package OOP.Abtract;

public class Abstract3 {
    public static void main(String[] args) {
        Triangle2 triangle = new Triangle2(5, 3, 4, 4);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        Circle2 circle = new Circle2(3);
        circle.resize(1.5);
        circle.draw();
    }
}
abstract class GeometricShape {

    public abstract double area();

    public abstract double perimeter();
}

class Triangle2 extends GeometricShape {

    private double base;
    private double height;
    private double side1;
    private double side2;
    public Triangle2(double base, double height, double side1, double side2) {
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
abstract class Shape2D {

    public abstract void draw();
    public abstract void resize(double scale);
}

class Rectangle extends Shape2D {

    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("Drawing" + width + "height " + height);
    }
    @Override
    public void resize(double scale) {
        width *= scale;
        height *= scale;
    }
}

class Circle2 extends Shape2D {

    private double radius;
    public Circle2(double radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing circle"+ radius);
    }
    @Override
    public void resize(double scale) {
        radius *= scale;
    }
}
abstract class Bird {
    public abstract void fly();
    public abstract void makeSound();
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("sky.");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle");
    }
}

class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.println("quick");
    }
    @Override
    public void makeSound() {
        System.out.println("Hawk");
    }
}

