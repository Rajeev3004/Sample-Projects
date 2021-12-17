package policies;

import java.util.Scanner;

public class BusinessInsurance implements Insurance
{
	int total_joined=0;
	double amount;
	@Override
	public void calculateInterest() {
		double interest=(0.30)*amount;
		System.out.println("interest in BusinessInsurance is "+interest);
		System.out.println("Your savings of BusinessInsurance is "+(amount+interest));
		amount=amount+interest;
	}
	public void join(double amt) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no:of persons with joining Insurance");
		int members=s.nextInt();
		total_joined++;
		System.out.println("you joined the BusinessInsurance policy with "+members+" members");
		amount=amt;
	}

}
