package com.beans;

import java.util.Scanner;

public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Scanner s=new Scanner(System.in);
		int sal=s.nextInt();
		int sal2=s.nextInt();
		emp1.setSalary(sal<0?sal=0:sal);
		emp2.setSalary(sal2<0?sal2=0:sal2);
		System.out.println("The yearly salary for emp1 without bonus is "+emp1.getSalary()*12);
		double bonus=(0.1)*sal;
		System.out.println("The yearly salary for emp1 with bonus is "+(emp1.getSalary()*12+bonus));
		bonus=(0.1)*sal2;
		System.out.println("The yearly salary for emp2 without bonus is "+emp2.getSalary()*12);
		System.out.println("The yearly salary for emp2 with bonus is "+(emp2.getSalary()*12+bonus));
	}

}
