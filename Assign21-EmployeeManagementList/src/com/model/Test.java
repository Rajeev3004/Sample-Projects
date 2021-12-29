package com.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Test 
{
	static LinkedList<Employee> ls;
	static String arrq[];
	public LinkedList<Employee>  insertEmployees() {
		 ls=new LinkedList<Employee>();	
		Scanner s=new Scanner(System.in);
		String name;
		int age;
		String country;		
		while(true) {
			System.out.println("Would you like to insert employee details y for yes/n for no");
			char c=s.next().charAt(0);
			if(c=='y') {
				name=s.next();
				age=s.nextInt();
				country=s.next();
				ls.add(new Employee(name, age, country));
			}
			else if(c=='n') {
				break;
			}
			else {
				System.out.println("Wrong input enter y to continue or n to stop");
			}
		}
		return ls;
	}
	public void retrieveEmployees(LinkedList<Employee> ls) {
		for(Employee e:ls)
			System.out.println(e.getName()+"\t"+e.getAge()+"\t"+e.getCountry());
	}
	public static void main(String[] args) {
		ls=new Test().insertEmployees();
		new Test().retrieveEmployees(ls);
		System.out.println("-----------------------------");
		System.out.println("Employees whose age>40 are");	
		for(Employee e:ls) {
			if(e.getAge()>40)
				System.out.println(e.getName()+" ");
		}
		System.out.println("-----------------------------");
		System.out.println("Employees belonging to Usa are ");
		for(Employee e:ls) {
			if(e.getCountry().equalsIgnoreCase("USA"))
				System.out.print(e.getName()+"   ");
		}
		for(Employee e:ls) {
			for(int i=0;i<ls.size();i++) {
			String arr=e.getCountry();
			String arrq[]=new String[ls.size()];
			arrq[i]=arr;
			Arrays.sort(arrq);
			System.out.println(arr+" "+e.getName());
			}
		
		}
}
	
}
