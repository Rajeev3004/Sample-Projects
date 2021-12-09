package finalkeyword;

public class Finalextends extends FinalEx
{
	//public void meth1() {}  //cannot override final methods
	public static void main(String[] args) {
		FinalEx obj= new Finalextends();
		obj.meth1();
	}
	

}
