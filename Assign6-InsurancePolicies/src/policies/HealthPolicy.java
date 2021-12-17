package policies;

public class HealthPolicy implements Insurance {
	int total_joined=0;
	double amount;
	@Override
	public void calculateInterest() {
		double interest=(0.2)*amount;
		System.out.println("interest in HealthPolicy is "+interest);
		System.out.println("Your savings of HealthPolicy is "+(amount+interest));
		amount=amount+interest;
	}
	public void join(double amt) {
		total_joined++;
		System.out.println("you joined the health policy");
		amount=amt;
	}

}
