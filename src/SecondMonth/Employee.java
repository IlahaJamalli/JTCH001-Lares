package SecondMonth;

public class Employee {
    //Create an Employee class with attributes: employeeId, name, salary, and a static attribute totalEmployees.
    int employeeId;
    String name;
    double salary;
    static int totalEmployees;
    static int totalSalary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalary++;
    }

    public static void setTotalEmployees(int totalEmployees) {
        Employee.totalEmployees = totalEmployees;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static int getTotalSalary() {
        return totalSalary;
    }

    public static void setTotalSalary(int totalSalary) {
        Employee.totalSalary = totalSalary;
    }
}
