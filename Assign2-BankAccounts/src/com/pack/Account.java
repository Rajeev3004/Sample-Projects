package com.pack;

public class Account 
{
	private static double balance;
	public void deposit(double amt) {
		balance=balance+amt;
		System.out.println("Amount deposited is: "+amt);
		
	}
	public void withdraw(double amt) {
		balance=balance-amt;
		System.out.println(amt+" has been withdrawn");
		System.out.println("Remaining balance : "+balance);
		
	}
	public void setBalance(double balance) {
		this.balance=balance;
		
	}
	public double getBalance() {
		return balance;
	}

}
