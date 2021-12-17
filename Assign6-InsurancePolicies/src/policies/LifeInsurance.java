package policies;

public class LifeInsurance implements Insurance
{
	int total_joined=0;
	double amount;
	@Override
	public void calculateInterest() {
		double interest=(0.18)*amount;
		System.out.println("interest in LifeInsurance is "+interest);
		System.out.println("Your savings of LifeInsurance is "+(amount+interest));
		amount=amount+interest;
	}
	public void join(double amt) {
		total_joined++;
		System.out.println("you joined the LifeInsurance policy");
		amount=amt;
	}

}
