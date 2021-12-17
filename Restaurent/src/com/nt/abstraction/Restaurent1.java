package com.nt.abstraction;

import java.util.Scanner;

public class Restaurent1 implements Services
{
	String item;
	@Override
	public void takeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Enter items required");
		Scanner s=new Scanner(System.in);
		 item=s.next();
	}

	@Override
	public void makeBill() {
		// TODO Auto-generated method stub
		double price;
		if(item.equals("biryani"))
			 price=300;
		else
			
			price=200;
		System.out.println("The price of item is "+price);
		double gst=(0.2)*price;
		System.out.println("Gst:"+gst);
		double total=price+gst;
		
		System.out.println("Total Price = "+total);
	}
	public static void main(String[] args) {
		Services r1=new Restaurent1();
		r1.takeOrder();
		r1.makeBill();
		System.out.println();
	}

}
