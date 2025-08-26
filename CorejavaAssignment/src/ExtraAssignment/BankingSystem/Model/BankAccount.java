package ExtraAssignment.BankingSystem.Model;
import ExtraAssignment.BankingSystem.Exceptions.InsufficientFundsException;
import ExtraAssignment.BankingSystem.Exceptions.InvalidAmountException;
/**
 * Represents a bank account with basic operations like deposit, withdrawal, and balance display.
 */
public class BankAccount {
	private int accountNumber;
    private double balance;

    /**
     * Parameterized constructor to initialize account number and balance.
     * @param accountNumber The account number
     * @param balance The initial balance
     */
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Deposits a valid amount into the account.
     * @param amount The amount to deposit
     * @throws InvalidAmountException If the amount is negative or zero
     */
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    /**
     * Withdraws an amount from the account.
     * @param amount The amount to withdraw
     * @throws InvalidAmountException If the amount is negative or zero
     * @throws InsufficientFundsException If there are not enough funds
     */
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    /**
     * Displays the current balance.
     */
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

}
