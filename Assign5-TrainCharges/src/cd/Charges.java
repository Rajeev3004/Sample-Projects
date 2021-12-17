package cd;

import java.util.Scanner;

public class Charges
{
	
	public void ticketCharge(int persons) {
		double fee=0;
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=persons;i++) {
			System.out.println("Enter age of the person: "+i);
			int x=s.nextInt();
			if(x<3)
				fee+=0;
			else if(x>=3 && x<=12)
				fee+=70;
			else if(x>=13 && x<=20)
				fee+=120;
			else if(x>=21 && x<=54)
				fee+=200;
			else if(x>=55)
				fee+=150;
			else
				System.out.println("Invalid Data");
		}
		System.out.println("The charges for all persons is Rs."+fee);
		double tax=(0.02)*fee;
		System.out.println("Tax is "+tax);
		System.out.println("The total charges for all persons is Rs."+(fee+tax));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total no:of persons");
		int total=s.nextInt();
		new Charges().ticketCharge(total);
	}

}
