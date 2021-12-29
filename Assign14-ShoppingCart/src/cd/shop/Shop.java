package cd.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {	
	public static void main(String[] args) {
		double grand_total=0;
		ArrayList<Item> cart =new ArrayList<Item>();
		System.out.println(cart);
		System.out.println("Enter no:of items");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		for(int i=1;i<=x;i++) {
			System.out.println("Enter the name, price, quantity of the "+i+" item");
			cart.add(new Item(s.next(),s.nextDouble(),s.nextInt()));
			System.out.println(i+"items entered");
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("Name"+"\t"+"Price"+"\t"+"Qty"+"\t"+"Total");
		System.out.println("--------------------------------------------------------");
		for(Item i:cart) {
			System.out.println(i.getName()+"\t"+i.getPrice()+"\t"+i.getQuantity()
								+"\t"+i.getPrice()*i.getQuantity());
			grand_total+=i.getPrice()*i.getQuantity();
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("Grand total of all items :"+grand_total);
	}
}
