package cd.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Salaries
{
	public static void main(String[] args) {
		double highest=0;
		double lowest = 0;
		int count=0;
		HashSet set=new HashSet();
		Scanner s=new Scanner(System.in);	
		while(true) {
			System.out.println("Do you want to enter salaries y/n");
			char i=s.next().charAt(0);
			if(i=='y') {
			System.out.println("Enter salary");
			double sal=s.nextInt();
			set.add(sal);
			}
			else if(i=='n')
				break;
			else
				System.out.println("Wrong input enter y or n");
		}
		System.out.println(set);
		for(Object o:set) {
			if((double)o>30000) 
				count++;
			if((double)o>highest)
				highest=(double) o;
			if(lowest==0)
				lowest=(double)o;		
			if((double)o<lowest)
				lowest=(double)o;
			
		}
		System.out.println("The no: of employees getting salary >30000 are: "+count);
		System.out.println("The highest salary is "+highest+" and the lowest salary is "+lowest);
	}
}
