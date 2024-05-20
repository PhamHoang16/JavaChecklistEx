package OOP;

/**
 * Inheritage
 */
public class Inheritance {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.withdraw(2000);
        savingsAccount.withdraw(200);
        System.out.println(savingsAccount.getBalance());
    }
}
class Animal {
    public void makeSound() {}
    public void move(){}
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meo");
    }
}
class Cheetah extends Animal {
    @Override
    public void move() {
        System.out.println("Run");
    }
}

class Vehicle {
    public void drive() {}
}
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

class Shape {
    public double getArea() {return 0;}
}
class Rectangle extends Shape {
    private double width;
    private double height;
    @Override
    public double getArea() {
        return this.width * this.height;
    }
}

//class Employee {
//    public void work(){}
//    public double getSalary(){return 0;}
//}
//class HRManager extends Employee {
//    @Override
//    public void work() {}
//    public void addEmployee(Employee Employee) {
//        System.out.println("Adding employee");
//    }
//}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("fail");
        }
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("fail");
        }
    }
}


//Bai 7
class Person {
    private String lastName;
    private String firstName;

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
class Employee2 extends Person {
    private String id;
    private String jobTitle;

    public Employee2(String lastName, String firstName, String id, String jobTitle) {
        super(lastName, firstName);
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return id;
    }
    @Override
    public String getLastName() {
        return super.getLastName().concat(jobTitle);
    }
}

//Bai 9

class Shape9 {
    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}

class Circle extends Shape9 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}


