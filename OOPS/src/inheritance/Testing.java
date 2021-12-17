package inheritance;

import java.util.Scanner;

public class Testing extends ArithmaticOperations
{
	public void welcome() {
		System.out.println("Child classs");
	}
	public static void main(String[] args) 
	{
		Testing t=new Testing();
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		t.welcome();
		System.out.println(t.addition(x, y));
		System.out.println(t.multiplication(x, y));
		System.out.println(t.subtraction(x, y));
		System.out.println(t.division(x, y));
	}

}
