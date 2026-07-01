public class Employee {

    private int employeeId;
    private String name;
    private String position;
    private double salary;

    // Constructor
    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Getter
    public int getEmployeeId() {
        return employeeId;
    }

    // Display Employee Details
    public void displayEmployee() {
        System.out.println("--------------------------------");
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Position    : " + position);
        System.out.println("Salary      : Rs." + salary);
    }
}