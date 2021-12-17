package exception;

import java.util.ArrayList;

public class ExceptionEx
{	
	public static void main(String[] args){
		try {
		 int a=10;
		 int b=20;
		 System.out.println("In try block");
		System.out.println(a/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("In finally block");
		}		
	}
}
