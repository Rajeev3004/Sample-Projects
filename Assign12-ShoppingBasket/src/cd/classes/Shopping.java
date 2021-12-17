package cd.classes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Shopping 
{
	LinkedHashMap<String,Double> map=new LinkedHashMap<String,Double>();
	double price;
	public Shopping() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("Mobiles present are: oneplus8t(30,000), iphone 12(40,000)");
		System.out.println("Watches present are: fastrack(2000), titan(3000) ");
		System.out.println("Books available are: HeadFirstJava(200), wings of fire(300)");
		System.out.println("Taxes on mobiles and watches are 10% and books are tax free");
		System.out.println("--------------------------------------------------------------");

	}
	public void OrderDetails() {
		double totalprice=0;
		System.out.println("----------------your orders include----------------------");
		for(Map.Entry entity:map.entrySet()) { 
		System.out.println(entity.getKey()+" = Rs."+entity.getValue());
		totalprice+=(double)entity.getValue();
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("Total price="+totalprice);
	}
	public void books(String string, int i) {
		if(string.equals("HeadFirstJava"))
			 price = 200;
		else if(string.equals("wings of fire"))
		price = 300;
		else
			System.out.println("no such item exists");
		System.out.println("Order placed for "+string+" with "+i+"units");
		map.put(string, price);
		
	}

	public void mobiles(String string, int i) {
		if(string.equals("OnePlus 8t"))
			 price = (30000+(0.1)*30000)*i;
		else if(string.equals("Iphone 12"))
			 price = (40000+(0.1)*40000)*i;
		else
			System.out.println("no such item exists");
		System.out.println("Order placed for "+string+" with "+i+"units");
		map.put(string, price);
		
	}
	public void mobiles(String string,int i, char j) {
		double imp_tax=0;
		if(string.equals("OnePlus 8t")) {
			imp_tax=(0.05)*30000;
			 price = (30000+(0.1)*30000+imp_tax)*i;
		}
		else if(string.equals("Iphone 12")) {
			imp_tax=(0.05)*40000;
			 price = (40000+(0.1)*40000+imp_tax)*i;
		}
		else
			System.out.println("no such item exists");
		System.out.println("Order placed for imported "+string+" with "+i+" units"+" with and Additional imported tax "+imp_tax);
		map.put(string, price);

	}

	public void watches(String string, int i) {
		if(string.equals("fastrack"))
			 price = (2000+(0.1)*2000)*i;
		else if(string.equals("titan"))
			 price = (3000+(0.1)*3000)*i;
		else
			System.out.println("no such item exists");
		System.out.println("Order placed for "+string+" with "+i+"units");
		map.put(string, price);		
	}
	
	
	

}
