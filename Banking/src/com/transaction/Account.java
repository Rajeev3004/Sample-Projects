package com.transaction;

public class Account 
{
	long accNo;
	String name;
	static String city="hyd";
	int balance;
	public Account(long accNO,String Name) {
		this.accNo=accNO;
		this.name=Name;
	}
	public void getDetails() {
		String branch="kukatpally";
		System.out.println("The account number is "+accNo);
		System.out.println("The Name of the Account holder is "+name);
		if(name=="rajeev")
			balance=5000;
		else
			balance=10000;
		System.out.println("The balance in account is"+balance );
		System.out.println("The city is "+city);
		System.out.println("The branch is "+branch);
		
	
	}

}
