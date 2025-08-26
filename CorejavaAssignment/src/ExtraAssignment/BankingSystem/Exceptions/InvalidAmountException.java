package ExtraAssignment.BankingSystem.Exceptions;
/**
 * Custom exception for handling insufficient funds during withdrawal.
 */
public class InvalidAmountException extends Exception{

	public InvalidAmountException(String message) {
		super(message);
	}
	

}
