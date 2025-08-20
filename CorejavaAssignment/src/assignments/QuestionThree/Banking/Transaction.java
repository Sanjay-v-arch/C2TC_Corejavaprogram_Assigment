package assignments.QuestionThree.Banking;

public class Transaction {
	private final double transactionFee = 10.0;

    public final void performTransaction(Account account, double amount, String type) {
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount + transactionFee); // add fee for withdrawals
        } else {
            System.out.println("Invalid transaction type!");
            return;
        }
        System.out.println("Transaction completed. Fee applied: " + transactionFee);
        System.out.println("New Balance: " + account.getBalance());
    }


}
