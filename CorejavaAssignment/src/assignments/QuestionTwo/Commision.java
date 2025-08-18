package assignments.QuestionTwo;
import java.util.*;
public class Commision {
	// Data Members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Method to accept details of the sales employee
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Address: ");
        address = scanner.nextLine();

        System.out.print("Enter Phone: ");
        phone = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = scanner.nextDouble();
    }

    // Method to calculate commission based on salesAmount
    public double calculateCommission() {
        if (salesAmount >= 100000) {
            return salesAmount * 0.10; // 10%
        } else if (salesAmount >= 50000) {
            return salesAmount * 0.05; // 5%
        } else if (salesAmount >= 30000) {
            return salesAmount * 0.03; // 3%
        } else {
            return 0; // No commission
        }
    }

    // Method to display details and commission
    public void displayDetails() {
        System.out.println("\nSales Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + calculateCommission());
    }

}
