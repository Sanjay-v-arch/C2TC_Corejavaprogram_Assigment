package assignments.QuestionOne.Employees;

public class Manager extends Employee{
	private String department;

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    // Getter and setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
