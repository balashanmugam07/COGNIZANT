public class EmployeeManager {

    private Employee[] employees;
    private int count;

    // Constructor
    public EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if (count < employees.length) {
            employees[count] = employee;
            count++;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee array is full.");
        }

    }

    // Search Employee
    public void searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == id) {
                System.out.println("\nEmployee Found");
                employees[i].displayEmployee();
                return;
            }

        }

        System.out.println("Employee not found.");
    }

    // Traverse Employees
    public void displayEmployees() {

        System.out.println("\nEmployee Records");

        for (int i = 0; i < count; i++) {
            employees[i].displayEmployee();
        }

    }

    // Delete Employee
    public void deleteEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee deleted successfully.");
                return;
            }

        }

        System.out.println("Employee not found.");
    }

}