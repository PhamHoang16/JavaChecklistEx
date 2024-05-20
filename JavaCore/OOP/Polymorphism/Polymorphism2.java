package OOP.Polymorphism;

public class Polymorphism2 {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();

        lion.eat();
        lion.sound();

        tiger.eat();
        tiger.sound();

        panther.eat();
        panther.sound();

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.startEngine();
        car.stopEngine();

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
    public void sound() {
        System.out.println("Animal is making a sound.");
    }
}

class Lion extends Animal {

    @Override
    public void eat() {
        System.out.println("meat.");
    }

    @Override
    public void sound() {
        System.out.println("Lion");
    }
}

class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("Tiger.");
    }
}

class Panther extends Animal {

    @Override
    public void eat() {
        System.out.println("meat.");
    }

    @Override
    public void sound() {
        System.out.println("Panther");
    }
}
class Vehicle {
    public void startEngine() {
        System.out.println("Vstarting.");
    }
    public void stopEngine() {
        System.out.println("stopping.");
    }
}

class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car engine starting ");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopping .");
    }
}

class Motorcycle extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine starting ");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopping ");
    }
}

