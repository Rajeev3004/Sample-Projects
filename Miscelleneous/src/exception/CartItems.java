package exception;

public class CartItems 
{
	public void cartItemsNumber(int n) throws MaxItemsException 
	{
		if(n>10) {
			throw new MaxItemsException("Max allowed items are only 10");
		}
		else
			System.out.println("You have succesfully placed "+n+" items");
	}
	public static void main(String[] args) {
		CartItems mobile=new CartItems();
		try {
			mobile.cartItemsNumber(12);
		} catch (MaxItemsException e) {
			
			e.printStackTrace();
			//System.err.println(e);
		}
	}

}
