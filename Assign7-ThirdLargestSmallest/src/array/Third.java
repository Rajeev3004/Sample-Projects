package array;

import java.util.Arrays;

public class Third
{
	public static void main(String[] args) {
		int arr[]= {1,2,9,4,5,4,7,8};
		int third_smallest=0;
		int third_largest=0;
		Arrays.sort(arr);
		third_smallest=arr[2];
		int arr2[] =new int[arr.length];
		int j=0;
			for(int i=arr.length-1;i>=0;i--) {
				arr2[j]=arr[i];
				j++;
			}
		
		third_largest=arr2[2];
		System.out.println(third_smallest);
		System.out.println(third_largest);
	}

}

