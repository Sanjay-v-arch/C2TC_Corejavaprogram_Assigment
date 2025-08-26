package ExtraAssignment.BankingSystem;
import ExtraAssignment.BankingSystem.Exceptions.InsufficientFundsException;
import ExtraAssignment.BankingSystem.Exceptions.InvalidAmountException;
import ExtraAssignment.BankingSystem.Model.BankAccount;
public class BankingSystemDemo {

	public static void main(String[] args) {
		// Creating a bank account with account number 1001 and initial balance 5000
        BankAccount account = new BankAccount(1001, 5000);

        // Demonstrating deposit
        try {
            account.deposit(1500);
        } catch (InvalidAmountException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Demonstrating invalid deposit
        try {
            account.deposit(-100);
        } catch (InvalidAmountException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Demonstrating withdrawal
        try {
            account.withdraw(2000);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Demonstrating withdrawal with insufficient funds
        try {
            account.withdraw(10000);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

	}

}
