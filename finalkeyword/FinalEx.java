package finalkeyword;

public  class FinalEx    //if class is final it cannot be inherited
{	
	/*final:variable cannot be modified
	       method cannot be overridden, can be overloaded also used in child class
	       Class cannot be inherited
	  */
	final int x;
	public FinalEx() {
		x = 2;
		System.out.println(x);
		//x++; //cannot modify final variable
	}
	public final void meth1() {
		System.out.println("final method ");
	}
	public static void main(String[] args) {
		FinalEx obj=new FinalEx();
		FinalEx obj2=new FinalEx();
	}

}
