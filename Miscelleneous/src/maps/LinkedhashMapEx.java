package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashMapEx
{
	public static void main(String[] args) {
	LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
	lhm.put(0, "book");
	lhm.put(1, "pencil");
	lhm.put(3, "pen");
	lhm.put(2, "ipad");
	lhm.put(2, "Stamppad");
	System.out.println(lhm);
	System.out.println(lhm.entrySet());
	for(Map.Entry entry:lhm.entrySet())
		System.out.println(entry.getKey()+" "+entry.getValue());
	
	}

}
