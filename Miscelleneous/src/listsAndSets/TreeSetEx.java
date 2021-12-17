package listsAndSets;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetEx
{
	public static void main(String[] args) {
		
		TreeSet s=new TreeSet();
		s.add(10);
		s.add(5);
		s.add(15);
		s.add(18);
		System.out.println(s);
		TreeSet ts=(TreeSet)s.descendingSet();
		s=ts;
		System.out.println(s);
		System.out.println(ts);
		
	}

}
