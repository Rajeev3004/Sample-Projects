package statickeyword;

public class StaticEx 
{
	int i=1;
	static int j=1;
	
	public StaticEx() {
		System.out.println("0-param constructor");	
		System.out.println("instance variable: "+(++i));
		System.out.println("Static Variable: "+(++j));
		
	}
	static {
		System.out.println("this is static block");
	}
	public static void addNum(int x,int y) {
		System.out.println("addition: "+(x+y));
	}
	public static void main(String[] args) {
		System.out.print("For obj1: ");
		StaticEx obj1=new StaticEx();
		System.out.println("For obj2: ");
		StaticEx obj2=new StaticEx();
		addNum(30, 20);       
		
	}

}
