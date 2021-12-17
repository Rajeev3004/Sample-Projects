package polymorphism;

import java.util.Scanner;

public class Child extends PolyArithmatic
{
	public void addition(int x, int y) {  //overriding parent method
		System.out.println("this is child class addition method");
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		PolyArithmatic p=new Child();
		Child c=new Child();
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		c.addition(n1,n2);
		p.addition(n1, n2);
	}

}
