
//class NegativeAmountException
public class NegativeAmountException extends Exception{
	private Account account;
	private double amount;
	private String transactionType;

//construct a negative amount exception
public NegativeAmountException(Account account, double amount, String TransactionType, String transactionType){
	super("Negative amount");
	this.account = account;
	this.amount = amount;
	this.transactionType = transactionType;

	}
}
