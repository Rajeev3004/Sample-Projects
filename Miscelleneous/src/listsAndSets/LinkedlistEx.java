package listsAndSets;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistEx
{
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add("Sachin");
		ll.add("50.0");
		ll.add('s');
		System.out.println("size: "+ll.size());
		System.out.println(ll);
		System.out.println(ll.remove(3));
		System.out.println(ll);
		ll.addFirst("tendulkar");
		ll.addLast(200);
		System.out.println(ll);
		ListIterator li=ll.listIterator();
		while(li.hasPrevious())
			System.out.print(li.previous());
		
	}

}
