package array;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting 
{
	public static void main(String[] args) {
		System.out.println("Enter no:of elements you want in an array");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int arr[]=new int[x];
		System.out.println("Enter the elements");
		for(int i=0;i<x;i++)
			arr[i]=s.nextInt();
		Arrays.sort(arr);
		System.out.println("Sorted Array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Sorted array in descending order");
		int desc[]=new int[x];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			desc[j]=arr[i];
			System.out.print(desc[j]+" ");
			j++;
		}
	}

}
