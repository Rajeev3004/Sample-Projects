package bufferbuilder;

public class BufferBuilderEx 
{
	public static void main(String[] args) {
		String s="hello";
		s.concat("hello");
		System.out.println(s.concat("Welcome"));
		StringBuffer s1=new StringBuffer(" Sachin");
		StringBuilder s2=new StringBuilder(" Virat");
		System.out.println(s1 );
		System.out.println(s2);
		s1.append(" Tendulkar ");
		System.out.println(s1);
		System.out.println(s2.append(" kohli "));
		s1.append(10);
		System.out.println(s1);
		int s2_cap=s2.capacity();
		System.out.println("capacity of s1 is "+s1.capacity());
		System.out.println("length of s1 is "+s1.length());
		System.out.println("capacity of s2 is "+s2_cap);
		
	}

}
