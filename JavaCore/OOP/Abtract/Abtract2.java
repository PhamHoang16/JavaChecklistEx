package OOP.Abtract;

public class Abtract2 {
    public static void main(String[] args) {

    }
}
abstract class Employee {
    private String fullname;
    private int id;

    public String getFullname() {
        return fullname;
    }

    public int getId() {
        return id;
    }

    public Employee(String fullname, int id) {
        this.fullname = fullname;
        this.id = id;
    }
    abstract void displayInfo();
    abstract double calculateSalary();
}
class Manager extends Employee {
    private double salary;

    public Manager(String fullname, int id, double salary) {
        super(fullname, id);
        this.salary = salary;
    }

    @Override
    void displayInfo() {
        System.out.println();
    }

    @Override
    double calculateSalary() {
        return 0;
    }
}


