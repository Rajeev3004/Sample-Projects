package abstraction;

import java.util.Scanner;

public class Child  extends AbstractParent implements AddInterface
{

	@Override
	public void addition(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("child class abstracted method");	
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		Child c=new Child();
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		c.addition(n1, n2);
		c.multi(n1, n2);
	}
	@Override
	public void multi(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Child of interface");
		System.out.println(x*y);
	}

}
