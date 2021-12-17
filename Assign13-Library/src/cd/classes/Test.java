package cd.classes;

public class Test 
{
	public static void main(String[] args) {
		Library obj=new Library();
		obj.searchByBookName("HeadFirst java");
		obj.searchByAuthorName("APJ Abdul Kalam");
		obj.searchByBookName("wings of fire");	
		obj.searchByAuthorName("Kathy Sierra");
		obj.searchBookByBoth("Chetan Bhagat","Three mistakes of my life");
		System.out.println("-------------------------");
		obj.returnBook("Three mistakes of my life");
		obj.returnBook("wings of fire");
		obj.returnBook("HeadFirst java");
		
	}

}
