package cd.Exceptionclasses;

public class Test 
{
	
	public static void main(String[] args) {
		try {
			/*Bank acc1=new Bank(12000);
			acc1.withdraw(13000);	*/		 //WithdrawalAmount Exception
			/*Bank acc2 = new Bank(10000);
			acc2.withdraw(5000); 	   
			acc2.deposit(12000);		
			acc2.withdraw(16500);  */   		//AccountBalance Exception
		/*	Bank acc3=new Bank(20000);
			acc3.withdraw(15000);
			acc3.deposit(10000);
			acc3.withdraw(5000);
			acc3.deposit(5000);			*/	//transactionCount Exception
			Bank acc4=new Bank(120000);
			acc4.withdraw(100000);
			acc4.deposit(20000);				//MaxTransactionAmount Exception
		} catch (AccountBalanceException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	      catch(TransactionAmountException e) {
	    	  e.printStackTrace();
	      }	
		catch(TransactionCountException e) {
			e.printStackTrace();
		}
		catch(WithdrawalAmountException e) {
			e.printStackTrace();
		}
	}
	
	
}
