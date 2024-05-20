package OOP.Abtract;

public class Abtract1 {
    public static void main(String[] args) {

    }
}
abstract class Animal {
    abstract void sound();
    abstract void eat();
    abstract void sleep();
}
class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("gao");
    }

    @Override
    void eat() {
        System.out.println("meat");
    }

    @Override
    void sleep() {
        System.out.println("sleep 8h");
    }
}
class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("gao gao");
    }

    @Override
    void eat() {
        System.out.println("meat");
    }

    @Override
    void sleep() {
        System.out.println("8h");
    }
}
class Deer extends Animal {

    @Override
    void sound() {
        System.out.println("");
    }

    @Override
    void eat() {
        System.out.println("grass");
    }

    @Override
    void sleep() {
        System.out.println("10h");
    }
}
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculatePerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }
}

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    double calculateArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
abstract class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }
}
class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }
}

