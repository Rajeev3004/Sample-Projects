package maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx
{
	public static void main(String[] args) {
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("id", 123);
		tm.put("salary", 20000);
		tm.put("deptno", 14);
		tm.put("dept", null);
		//tm.put(null, 120); null key not allowed null values are allowed
		System.out.println(tm);
		System.out.println(tm.entrySet());
		for(Map.Entry e:tm.entrySet())
			System.out.println(e.getKey()+":"+e.getValue());
	}

}
