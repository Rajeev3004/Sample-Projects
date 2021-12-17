package cd.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeFile 
{
	public static void main(String[] args) {
	try {
		FileOutputStream fw=new FileOutputStream("E://employee.txt");
		for(int i=1;i<=5;i++) {
			System.out.println("enterr the name of the employee:"+i);
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			System.out.println("enter the lpa of employee");			
			double lpa=sc.nextDouble();
			double ann_sal=lpa*100000;
			double gross_sal=ann_sal/12;
			double net_sal=(0.8)*gross_sal;
			String txt=i+". "+"For the employee "+s+" The gross salary is "+gross_sal+" and the Net sal is "+net_sal+"\n";			
			byte[] arr=txt.getBytes();
			fw.write(arr);
			System.out.println("Employee details are stored in a file");
			System.out.println();
		}
		System.out.println("Employee details are");
		System.out.println("-------------------------------------");
		FileInputStream fis=new FileInputStream("E://employee.txt");
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fw.close();
		
	} catch (IOException e) {		
		e.printStackTrace();
	}
	}

}
