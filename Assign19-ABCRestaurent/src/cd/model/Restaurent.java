package cd.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Restaurent 
{
	Scanner s;
	double total_bill;
	public Map itemsPrices() {
		Map<String,Integer> items=new LinkedHashMap<String,Integer>();
		items.put("Fried Rice", 100);
		items.put("Biryani", 200);
		items.put("Roti",25);
		items.put("PaneerMasalaCurry",150);
		items.put("water", 30);
		items.put("Cool drink", 50);
		//for(Map.Entry<String, Double>e:items.entrySet())
		//System.out.println(e.getKey());
		return items;

	}
	public void orderFood(int n) {
		int i=1;
		while(i<=n) {
			System.out.println("Enter food item, quantity");
			s=new Scanner(System.in);
			String item=s.nextLine();
			int qty=s.nextInt();
			double price;
			switch(item) {
			case "Biryani": price=200*qty;
							total_bill+=price;
							System.out.println(item+" of "+qty+" numbers is selected");
							break;
			case "water": price=30*qty;
							total_bill+=price;
							System.out.println(item+" of "+qty+" numbers is selected");
							break;						
			case "Fried Rice":price=30*qty;
							total_bill+=price;
							System.out.println(item+" of "+qty+" numbers is selected");
							break;
			case "PaneerMasalaCurry":price=150*qty;
							total_bill+=price;
							System.out.println(item+" of "+qty+" numbers is selected");
							break;
			case "Cool drink":price=50*qty;
							total_bill+=price;
							System.out.println(item+" of "+qty+" numbers is selected");
							break;
			case "Roti":price=25*qty;
							total_bill+=price;
							System.out.println(item+" of "+qty+" numbers is selected");
							break;
			 default: System.out.println("Item not found please check list");
			 		  break;
			 
			}
			i++;
		}
		System.out.println("Your Total price for the orders is "+total_bill);
		System.out.println("Would you like to order again");
		char c=s.next().charAt(0);
		if(c=='y')
			this.orderFood(s.nextInt());
		else if(c=='n')
			System.out.println("Thank you, Enjoy your meal");
		else 
			System.out.println("Wrong input, input y or n");
	}
	public static void main(String[] args) {
		Map items=new Restaurent().itemsPrices();
		System.out.println("The following items are present here");
		HashSet hs=new HashSet(items.entrySet());
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("How many items do you want to order");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		new Restaurent().orderFood(n);
	}


}
