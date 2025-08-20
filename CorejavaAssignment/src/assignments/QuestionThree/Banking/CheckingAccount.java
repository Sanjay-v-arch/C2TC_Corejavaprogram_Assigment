package assignments.QuestionThree.Banking;

public class CheckingAccount extends Account {
    private static final double OVERDRAFT_LIMIT = -1000;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Checking Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Checking Account.");
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
