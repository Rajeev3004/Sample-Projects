package polymorphism;

import java.util.Scanner;

public class PolyArithmatic 
{
	public void addition(int x, int y) {
		System.out.println("this is parent class addition method");
		System.out.println(x+y);
	}
	public void addition(int x, int y, int z) {  //method overloading
		System.out.println(x+y+z);
	}
	public static void main(String[] args)
	{
		PolyArithmatic p=new PolyArithmatic();
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		p.addition(n1,n2);
		p.addition(n1,n2,n3);
	}

}
