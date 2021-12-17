package com.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StringsSort 
{
	
	public void sortByLength(String[] arr) {
		int len=arr.length;
		System.out.println("After sorting");
		System.out.print("{");
		for(int i=1;i<len;i++) //hello welcome to java
		{
			String word=arr[i]; //welcome
			int in=i-1;			//0	
			while(in>=0 && word.length()<arr[in].length()) { //welcome<hello
				arr[in+1]=arr[in]; //arr[1]=arr[0]
				in--;         
			}
			arr[in+1]=word; //0+1=arr[1]=word
		}
		for(String s:arr)
			System.out.print(s+" ");
		System.out.print("}");
		
	}
	public static void main(String[] args) {
		System.out.println("Enter number of strings");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
			arr[i]=s.next();
		System.out.println("Before sorting");
		System.out.print("{");
		int i=0;
		for(String st:arr) {
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.println("}");
		new StringsSort().sortByLength(arr);
	}

}
