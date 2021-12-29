package cd.model;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame 
{
	int min=50;
	int max=150;
	 int x; 
	//int ctr=0;
	int num;
	
	Scanner s=new Scanner(System.in);
	public void find() {
		System.out.println("Guess the random number you have 7 chances");
		Random r=new Random();
		x=50+r.nextInt(150);
		System.out.println();
		for(int i=1;i<=7;i++) {
			System.out.println("enter your choice :");
			num=s.nextInt();
			if(num<x) {
				System.out.println("Too low");
				System.out.println("Try again");
			}
			else if(num>x) {
				System.out.println("Too high");
				System.out.println("Try again");
			}
			else if(num==x) {
				System.out.println("you won");
				return;
			}
			else
				System.out.println("wrong input");
		}
		System.out.println("you lost, the number is :"+x);
		
			
	}
	public static void main(String[] args) {	
		new RandomNumberGame().find();
	}

}
