package policies;

public class Pension implements Insurance
{
	int total_joined=0;
	double amount;
	@Override
	public void calculateInterest() {
		double interest=(0.15)*amount;
		System.out.println("interest in Pension is "+interest);
		System.out.println("Your savings of Pension is "+(amount+interest));
		amount=amount+interest;
	}
	public void join(double amt) {
		total_joined++;
		System.out.println("you joined the Pension policy");
		amount=amt;
	}

}
