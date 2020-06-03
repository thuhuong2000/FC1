package bill;
import java.util.Scanner;
public class Item {
	private String itemName;
	private int itemPrice;
	private Byte amount;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName=itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice=itemPrice;
	}
	public Byte getAmount() {
		return amount;
	}
	public void setAmount(Byte amount) {
		this.amount=amount;
	}
	public Item() {
		this.itemName="";
	}
	public Item(String itemName,int itemPrice,Byte amount) {
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.amount=amount;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		//System.out.println("Enter the itemName:");
		this.setItemName(kb.nextLine());
		//System.out.println("Enter the itemPrice:");
		this.setItemPrice(kb.nextInt());
		//System.out.println("Enter the amount:");
		this.setAmount(kb.nextByte());
	}
	public void output() {
		System.out.println(this.itemName +" " +this.itemPrice +" "+this.amount);
	}
	public double value() {
		return this.itemPrice*this.amount;
	}
	public static void main(String[] args) {
		Item n=new Item();
		n.input();
		n.output();
		System.out.println(n.value());

	}

}
