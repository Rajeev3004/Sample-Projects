package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapEx 
{
	public static void main(String[] args) {
		HashMap<Character,String> map=new HashMap<Character,String>();
		map.put('a', "mobile");
		map.put('c', "laptop");
		map.put('v', "bat");
		map.put('b', "earphones");
		map.put('e', "Trimmer");
		System.out.println(map);
		System.out.println(map.keySet());
		map.put('c', "earphones");
		System.out.println(map);
		for(Map.Entry entry: map.entrySet()) 
			System.out.println(entry.getKey()+" "+entry.getValue());
	}
	

}
