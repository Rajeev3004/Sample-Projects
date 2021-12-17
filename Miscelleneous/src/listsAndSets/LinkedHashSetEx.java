package listsAndSets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx 
{
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Sachin");
		lhs.add("Cricketer");
		lhs.add(46);
		lhs.add(52.5);
		System.out.println(lhs);
		Iterator i=lhs.iterator();
		while(i.hasNext())
		System.out.print(i.next()+" ");
		
	}

}
