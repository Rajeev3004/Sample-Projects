package cd.shop;

public class Item 
{
	private String name;
	private double price;
	private int quantity;
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}	
	public Item(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}	
}
