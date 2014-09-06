//class InsufficientAmountException

public class InsufficientFundException extends Exception{
	private Account account;
	private double amount;
	private String transactionType;

//construct an insufficient amount exception
public InsufficientFundException(Account account, double amount, String TransactionType, String transactionType){
	super("Insufficeint amount");
	this.account = account;
	this.amount = amount;
	this.transactionType = transactionType;

		}
	}