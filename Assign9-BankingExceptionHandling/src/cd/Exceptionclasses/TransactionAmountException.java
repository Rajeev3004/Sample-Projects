package cd.Exceptionclasses;

public class TransactionAmountException extends Exception
{
	//String msg="Transaction exceeded the max limit of 1 lakh";
	public TransactionAmountException(String msg) {
		super(msg);
	}

}
