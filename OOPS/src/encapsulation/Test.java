package encapsulation;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Operations op=new Operations();
		int x=sc.nextInt();
		op.setNum1(x);
		int y=sc.nextInt();
		op.setNum2(y);
		int add=op.getNum1()+op.getNum2();
		int mult=op.getNum1()*op.getNum2();
		int sub=op.getNum1()-op.getNum2();
		int div=op.getNum1()/op.getNum2();
		System.out.println("Addition :"+add);
		System.out.println("Multiplication: "+mult);
		System.out.println("subtraction :"+sub);
		System.out.println("Division :"+div);
		
	}

}
