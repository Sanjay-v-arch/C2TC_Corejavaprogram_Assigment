package assignments.QuestionThree.Banking;

public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account.");
        } else {
            System.out.println("Withdrawal denied! Maintain minimum balance of " + MIN_BALANCE);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}