package com.pack;

public class CheckingAccount extends Account
{
	private int transactions=0;
	double amount;
	static double  fee=5;
	public  void deductFee(double amount) {
		System.out.println("in deduxr");
		double y=amount/10000;
		fee=fee*y;
		System.out.println("Fee is "+fee);
		super.setBalance(amount-fee);
		System.out.println(super.getBalance());
	}
	public CheckingAccount(double amt) {
		System.out.println("consturctor");
		this.amount=amt;
		System.out.println("set value ");
		if(amount>=50000)
		{
			System.out.println("going to deduct method");
			deductFee(amount);
		}
		else
			super.withdraw(amount);		
	}
}
