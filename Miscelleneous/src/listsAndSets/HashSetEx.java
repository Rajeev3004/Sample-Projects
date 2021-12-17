package listsAndSets;

import java.util.HashSet;

public class HashSetEx 
{	
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("Sachin");
		hs.add("Cricketer");
		hs.add(46);
		hs.add(52.5);
		System.out.println(hs);
		System.out.println("size: "+hs.size());
		System.out.println("isEmpty: "+hs.isEmpty());
		System.out.println();
	
	}

}
