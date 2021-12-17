package cd.classes;

public class Library 
{
	int ctr;
	int ctr_b1=20;
	int ctr_b2=25;
	int ctr_b3=30;
	int ctr_b4=12;
	String[] bookNames= {"wings of fire","the monk who sold his ferrari","HeadFirst java","Three mistakes of my life"};

	String[] authors= {"APJ Abdul Kalam","Robin Sharma","Kathy Sierra", "Chetan Bhagat"};
	int[] availableCopies= {20, 25, 30,12};

	public void searchByBookName(String s) {
		int i=0;
		switch(s) {
		case "wings of fire": ctr_b1=issueBook(s,ctr_b1);

		System.out.println("Remaining books :"+ctr_b1);
		break;
		case "the monk who sold his ferrari":ctr_b2= issueBook(s,ctr_b2);


		System.out.println("Remaining books :"+ctr_b2);
		break;
		case "HeadFirst java":ctr_b3= issueBook(s,ctr_b3);

		System.out.println("Remaining books :"+ctr_b3);
		break;
		case "Three mistakes of my life":ctr_b4= issueBook(s,ctr_b4);

		System.out.println("Remaining books :"+ctr_b4);
		break;
		}
	}

	public void searchByAuthorName(String str) {

		switch(str) {
		case "APJ Abdul Kalam": ctr_b1= issueBook(bookNames[0],ctr_b1);
		System.out.println("Remaining books are "+ctr_b1);
		break;

		case "Robin Sharma":ctr_b2= issueBook(bookNames[1],ctr_b2);
		System.out.println("Remaining books are "+ctr_b2);
		break;
		case "Kathy Sierra":ctr_b3= issueBook(bookNames[2],ctr_b3);
		System.out.println("Remaining books are "+ctr_b3);
		break;
		case "Chetan Bhagat":ctr_b4= issueBook(bookNames[3],ctr_b4);
		System.out.println("Remaining books are "+ctr_b4);
		break;
		}
	}
	public int returnBook(String s) {
		int ctrr=0;
		switch(s) {
		case "wings of fire":ctrr=ctr_b1;
		++ctrr;
		break;
		case"the monk who sold his ferrari":ctrr=ctr_b2;
		++ctrr;
		break;
		case "HeadFirst java":ctrr=ctr_b3;
		++ctrr;
		break;
		case "Three mistakes of my life":ctrr=ctr_b4;
		++ctrr;	
		break;
		}
		System.out.println(s+" is returned");
		System.out.println("Remaining "+s+" books are "+(ctrr));
		return ctrr;
	}

	public void searchBookByBoth(String author, String book) {
		String s=author;
		String b=book;
		int ctrr=0;
		switch(b) {
		case "wings of fire":ctrr=ctr_b1;
		ctr_b1--;
		break;
		case"the monk who sold his ferrari":ctrr=ctr_b2;
		ctr_b2--;
		break;
		case "HeadFirst java":ctrr=ctr_b3;
		ctr_b3--;
		break;
		case "Three mistakes of my life":ctrr=ctr_b4;
		ctr_b4--;
		break;		
		}
		for(int i=0;i<authors.length;i++) 
		{
			if(s.equals(authors[i])) {
				issueBook(b,ctrr);
				System.out.println("Remaining "+b+" books are "+(--ctrr));
			}		
		}
		//System.out.println("no book or author exists");
	}

	public static int  issueBook(String book,int ctr) {
		--ctr;
		System.out.println("You can take the book "+book+" and return it after reading");
		return ctr;
	}

}
