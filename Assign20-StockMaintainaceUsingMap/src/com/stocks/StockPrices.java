package com.stocks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StockPrices 
{
	Map<String,Integer> map=new HashMap<String,Integer>();
	public Map<String, Integer> addStock(){
		map.put("MRF",245);
		map.put("Honeywell",180); 
		map.put("Page Industries",694);  
		map.put("Shree Cements",149);
		map.put("Nestle India",347);
		map.put("Abbott India",231);
		System.out.println(map);
		return map;
	}
	public static void main(String[] args) {
		StockPrices sp=new StockPrices();
		Map map=sp.addStock();
		int high=0;
		String highest=null;
		int sum = 0;
		int init_size=map.size();
		HashSet s=new HashSet( map.entrySet());
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Entry e=(Entry)i.next();
			if((int)e.getValue()>high) {
				high=(int) e.getValue();
				highest=(String) e.getKey();
			}
			sum=sum+(int)e.getValue();
			if((int)e.getValue()<200) 
				map.remove(e.getKey());
		}
		System.out.println("The average of all stocks is "+sum/init_size);
		System.out.println("The highest Stock price is "+high+" the company is "+highest);		
		System.out.println(map);
	}
	
}
