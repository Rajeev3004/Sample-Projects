package policies;

public class Testing 
{
	public static void main(String[] args) {
		Insurance user1=new HealthPolicy();
		user1.join(80000);
		user1.calculateInterest();
		 user1=new LifeInsurance();
		user1.join(100000);
		user1.calculateInterest();
		user1=new Pension();
		user1.join(120000);
		user1.calculateInterest();
	}

}
