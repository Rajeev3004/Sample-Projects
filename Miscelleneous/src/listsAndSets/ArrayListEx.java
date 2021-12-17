package listsAndSets;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add('a');
		al.add("welcome");
		al.add(10.5);
		al.remove(1);
		System.out.println(al);
		System.out.println(al.contains("java"));
		System.out.println(al.get(0));
		System.out.println(al.indexOf("welcome"));
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
	}

}
