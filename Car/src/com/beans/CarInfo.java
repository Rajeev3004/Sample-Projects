package com.beans;

import java.util.Scanner;

public class CarInfo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Car c1=new Car();
		String name=sc.next();
		c1.setName(name);
		double price=sc.nextDouble();
		c1.setPrice(price);
		int mileage=sc.nextInt();
		c1.setMileage(mileage);
		int max_sp=sc.nextInt();
		c1.setMax_speed(max_sp);
		System.out.println("Car name is "+c1.getName());
		System.out.println("Price is "+c1.getPrice());
		System.out.println("Mileage is "+c1.getMileage()+" kms");
		System.out.println("Max Speed is "+c1.getMax_speed()+" km/hr");
	}


}
