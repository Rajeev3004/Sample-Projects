package com.model;

import java.util.Scanner;

public class Main 
{
	static Scanner s=new Scanner(System.in);
	public static Movie getMovieDetails() {
		System.out.println("Enter movie name");
		Movie m=new Movie();
		m.setMovieName(s.next());
		String circle=getCircle();
		System.out.println("Enter Movie Category");
		m.setMovieCategory(s.next());
		int x=m.calculateTicketCost(circle);
		m.setTicketCost(m.calculateTicketCost(circle));
		return m;		
	}
	public static String getCircle() 
	{
		System.out.println("Enter circle ");
		String circle=s.next();
		return circle;
	}
	public static void main(String[] args) {
		Movie m=new Movie();
		m=Main.getMovieDetails();
		System.out.println("Name of the movie: "+m.getMovieName());
		System.out.println("Category of the movie: "+m.getMovieCategory());
		int x=m.getTicketCost();
		if(x==-1)
			System.out.println("NO such circle exists");
		else if(x==-2)
			System.out.println("No such Category exists");
		else if(x==-3)
			System.out.println("both category and circle is invalid");
		else
			System.out.println("Ticket Cost: "+m.getTicketCost());
	}

}
