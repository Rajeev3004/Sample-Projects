package com.cd;

import java.util.Scanner;

public class ElectricCharges 
{
	double billAmt;
	public void findBills(int x) {
		if(x<100) {
			billAmt=0;
			System.out.println("The bill is "+billAmt);
		}
		
		else if(x>100 && x<=200) {
			billAmt=100*0+(x-100)*1.5;
			System.out.println("The bill is RS."+billAmt);
		}
		else if(x>200 && x<=500) {
			billAmt=100*0+(100)*2+(x-200)*3;
			System.out.println("The bill for "+x+" units is "+billAmt);
		}
		else if(x>500) {
			billAmt=100*0+100*3.5+300*4.6+(x-500)*6.6;
			System.out.println("The bill for "+x+" units is "+billAmt);
		}
		else 
			System.out.println("invalid Number, Check Again");
						
	}
	public static void main(String[] args) {
		ElectricCharges user1=new ElectricCharges();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no:of units");
	int y=sc.nextInt();
		user1.findBills(y);
	}

}
