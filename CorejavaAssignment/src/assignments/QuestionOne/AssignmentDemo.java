package assignments.QuestionOne;
import assignments.QuestionOne.Employees.Manager;
import assignments.QuestionOne.Employees.Developer;
import assignments.QuestionOne.Utilities.EmployeeUtilities;
public class AssignmentDemo {
	public static void main(String[] args) {
        // Create Manager instance
        Manager manager = new Manager("Sanjay", 113, 90000.0, "TEAM MANAGER");

        // Create Developer instance
        Developer developer = new Developer("Bob Smith", 102, 80000.0, "TESTER TOOL");

        // Print details before increment
        System.out.println("OLD salary increment:");
        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println("POSITION: " + manager.getDepartment());

        System.out.println();

        EmployeeUtilities.printEmployeeDetails(developer);
        System.out.println("SKILL: " + developer.getProgrammingLanguage());

        System.out.println();

        // Apply salary increments
        EmployeeUtilities.applySalaryIncrement(manager, 5000);
        EmployeeUtilities.applySalaryIncrement(developer, 4000);

        // Print details after increment
        System.out.println("NEW salary increment:");
        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        System.out.println();

        EmployeeUtilities.printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }

}
