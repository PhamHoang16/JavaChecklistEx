package OOP.Encapsulation;
public class Employee {

    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public Employee(int employee_id, String employee_name, double employee_salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String getEmployee_salary() {
        // Format salary to currency string (replace with desired format)
        return String.format("$%.2f", employee_salary);
    }
}
