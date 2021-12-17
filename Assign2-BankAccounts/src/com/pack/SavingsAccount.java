package com.pack;

public class SavingsAccount extends Account
{
	private double interest=0.00d;
	int rate;
	public void calcualteInterest(double rate) {
		double bal=super.getBalance();
		System.out.println(rate/100);
		System.out.println("your balance is "+bal);
		interest=(rate/100) * bal;
		System.out.println("your interest is "+interest);
		super.deposit(interest);
		System.out.println("Final balance after adding interest is "+super.getBalance());
	}
	public SavingsAccount(double amt) {
		super.deposit(amt);
		
	}
	

}
