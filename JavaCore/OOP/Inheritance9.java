package OOP;

public class Inheritance9 {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2023, "Diesel", 5000);
        System.out.println(truck.calculateDistanceTraveled(truck.calculateFuelEfficiency(), 15));
    }
}
class Vehicle9 {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle9(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }


    public double calculateDistanceTraveled(double fuelEfficiency, double fuelLevel) {
        return fuelLevel * fuelEfficiency;
    }

    public double calculateFuelEfficiency(){return 0;}
    public double getMaxSpeed(){return 0;}
}
class Truck extends Vehicle9 {
    private int cargoCapacity;

    public Truck(String make, String model, int year, String fuelType, int cargoCapacity) {
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
    }


    @Override
    public double calculateFuelEfficiency() {
        return 10.0;
    }

    @Override
    public double getMaxSpeed() {
        return 80.0;
    }
}

class Car9 extends Vehicle9 {
    private int numberOfDoors;

    public Car9(String make, String model, int year, String fuelType, int numberOfDoors) {
        super(make, model, year, fuelType);
        this.numberOfDoors = numberOfDoors;
    }


    @Override
    public double calculateFuelEfficiency() {
        // Implement logic based on car size, engine type, etc. (replace with actual calculation)
        return 25.0;
    }

    @Override
    public double getMaxSpeed() {
        return 120.0;
    }
}

class Motorcycle extends Vehicle9{
    private int engineDisplacement;

    public Motorcycle(String make, String model, int year, String fuelType, int engineDisplacement) {
        super(make, model, year, fuelType);
        this.engineDisplacement = engineDisplacement;
    }


    @Override
    public double calculateFuelEfficiency() {
        return 50.0;
    }

    @Override
    public double getMaxSpeed() {
        return 150.0;
    }
}


