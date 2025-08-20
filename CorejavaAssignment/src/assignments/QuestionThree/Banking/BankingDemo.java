package assignments.QuestionThree.Banking;

public class BankingDemo {
	public static void main(String[] args) {
        Account savings = new SavingsAccount("SAV123", 1000);
        Account checking = new CheckingAccount("CHK456", 500);

        Transaction transaction = new Transaction();

        System.out.println("\n--- Savings Account Transactions ---");
        transaction.performTransaction(savings, 200, "deposit");
        transaction.performTransaction(savings, 300, "withdraw");

        System.out.println("\n--- Checking Account Transactions ---");
        transaction.performTransaction(checking, 100, "deposit");
        transaction.performTransaction(checking, 700, "withdraw");

        System.out.println("\nTotal Accounts Created: " + Bank.getTotalAccounts());
    }

}
