package assignments.QuestionOne.Employees;

public class Employee {
	private String name;
    private int employeeId;
    private double salary;

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public void increaseSalary(double amount) {
    	if(amount > 0) {
    		this.salary +=amount;
    	}
    }

    // Getters and setters for private attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    protected void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }


}
