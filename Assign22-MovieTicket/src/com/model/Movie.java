package com.model;

public class Movie 
{
	private String movieName;
	private String movieCategory;
	private int ticketCost;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieCategory() {
		return movieCategory;
	}
	public void setMovieCategory(String movieCategory) {
		this.movieCategory = movieCategory;
	}
	public int getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}
	public int calculateTicketCost(String circle) {
		if(circle.equalsIgnoreCase("gold"))
		{
			if(movieCategory.equalsIgnoreCase("2D"))
				ticketCost=300;
			else if(movieCategory.equalsIgnoreCase("3D"))
				ticketCost=500;
			else
				return -2;
		}
		else if(circle.equalsIgnoreCase("silver"))
		{		
			if(movieCategory.equalsIgnoreCase("2D"))
				ticketCost=250;
			else if(movieCategory.equalsIgnoreCase("3D"))
				ticketCost=450;
			else 
				return -2;
		}
		else if((!(circle.equalsIgnoreCase("gold")) || !(circle.equalsIgnoreCase("silver"))) && ((movieCategory.equalsIgnoreCase("2D")) || (movieCategory.equalsIgnoreCase("3D"))))
				return -1;
		else 
			return -3;	
		return ticketCost;		
	}

}
