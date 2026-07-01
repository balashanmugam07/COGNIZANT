public class EmployeeManagementTest {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager(10);

        // Add Employees
        manager.addEmployee(new Employee(101, "Rahul", "Developer", 50000));
        manager.addEmployee(new Employee(102, "Priya", "Tester", 45000));
        manager.addEmployee(new Employee(103, "Arun", "Manager", 75000));

        // Display Employees
        manager.displayEmployees();

        // Search Employee
        manager.searchEmployee(102);

        // Delete Employee
        manager.deleteEmployee(102);

        // Display Employees Again
        manager.displayEmployees();
    }

}