package assignments.QuestionOne.Utilities;
import assignments.QuestionOne.Employees.Employee;

public class EmployeeUtilities {

    /**
     * Prints the details of an employee.
     * Accesses public getters to retrieve private data.
     *
     * @param employee Employee object whose details are printed.
     */
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    /**
     * Applies a salary increment to an employee.
     * Demonstrates access to protected setter method.
     *
     * @param employee Employee object whose salary is to be updated.
     * @param increment Amount to increase the salary by.
     */
    public static void applySalaryIncrement(Employee employee, double increment) {
        employee.increaseSalary(increment);
        // Using protected setter since this class is outside employees package,
        // so we must rely on public/protected access - here we can use public methods only,
        // but setter is protected, so let's simulate by calling public methods (e.g. via subclass),
        // but since protected methods aren't accessible here, we cannot call setSalary directly.
        // So for this assignment, let's assume setSalary is public or provide a method in Employee to increase salary.
        
        // To solve this, let's add a public method in Employee to increase salary (I'll add it there).
    }

}
