package OOP;

public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("hoang", "hanoi", 100000, "dev", "aka");
        Developer developer = new Developer("hoang", "hanoi", 100000, "dev");
        Programmer programmer = new Programmer("hoang", "hanoi", 100000, "dev");
        System.out.println(manager.caculateBonus());
        System.out.println(manager.manageProject());
        System.out.println(manager.generatePerformance());
    }
}
class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double caculateBonus() {
        return 0;
    }
    public String generatePerformance(){return "";}
    public String manageProject() {return "";}
}

class Manager extends Employee {
    private String project;
    public Manager(String name, String address, double salary, String jobTitle, String project) {
        super(name, address, salary, jobTitle);
        this.project = project;

    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String generatePerformance() {
        return "performance report";
    }

    @Override
    public double caculateBonus() {
        return getSalary()*0.2;
    }

    @Override
    public String manageProject() {
        return getName().concat(" is manage project ").concat(project);
    }
}
class Developer extends Employee {
    public Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }
    @Override
    public double caculateBonus() {
        return getSalary()*0.1;
    }
    @Override
    public String generatePerformance() {
        return "performance report";
    }
}
class Programmer extends Employee {
    public Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }
    @Override
    public double caculateBonus() {
        return getSalary()*0.1;
    }
    @Override
    public String generatePerformance() {
        return "performance report";
    }
}
