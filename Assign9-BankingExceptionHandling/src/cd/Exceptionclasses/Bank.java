package cd.Exceptionclasses;

public class Bank 
{
	double balance=0;
	int tr_count=0;
	double tr_amt=0;
	public Bank(double amt) {
		balance =amt;
		System.out.println("New Account created, Your balance is "+amt);
	}
	public void withdraw(double amt) throws TransactionCountException, TransactionAmountException, AccountBalanceException, WithdrawalAmountException {
		tr_count++;
		tr_amt+=amt;
		if(tr_amt>=100000) {
			throw new TransactionAmountException("Amount exceeded 100000,");
		}
		else if(tr_count>3)
			throw new TransactionCountException("Maximum transactions 3 reached.Check back later");
		else 
		{
			if(amt<balance) {
				balance=balance-amt;
				if(balance<1000)
					throw new AccountBalanceException("Balance "+balance+" less than 1000");
				else
				System.out.println(amt+"has been debited from your account. New balance: "+balance);

			}
			else
				throw new WithdrawalAmountException("Withdrawal amount has to be less than balance amount");
		}
	}


	public void deposit(double amt) throws TransactionAmountException, TransactionCountException {
		tr_count++;
		tr_amt+=amt;
		if(tr_amt>=100000)
			throw new TransactionAmountException("Maximum transaction amount 100000 done");
		else if(tr_count>=3)
			throw new TransactionCountException("Maximum transactions 3 reached.Check back later");
		else {			
			System.out.println(amt+" has been deposited");
			balance+=amt;
			System.out.println("New balance: "+balance);
		}
	}

}
