package bill;
import java.util.Scanner;
public class Bill {
	private Item []a=new Item[100];
	private int n;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		if(n<0) this.n=0;
		else this.n=n;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.print("How many items in this bill:");
		this.setN(kb.nextInt());
		for(int i=0;i<n;i++) {
			System.out.print("Item"+(i+1)+ ":" );
			Item n=new Item();
			n.input();
			a[i]=n;
		}
	}
	public void output() {
		System.out.println("Bill");
		for(int i=0;i<n;i++) {
			a[i].output();
			//a[i].value();
		}
		System.out.println();
	}
	public void minPrice() {
		int vt=0;
		int min=a[0].getItemPrice();
		for(int i=1;i<n;i++) {
			if(min>a[i].getItemPrice()) {
				min=a[i].getItemPrice();
				vt=i;
			}
		}
		System.out.println("MinPrice:"+ a[vt].getItemName()+ " "+a[vt].getItemPrice());
	}
	public void maxPrice() {
		int vt=0;
		int max=a[0].getItemPrice();
		for(int i=1;i<n;i++) {
			if(max<a[i].getItemPrice()) {
				max=a[i].getItemPrice();
				vt=i;
			}
		}
		System.out.println("MaxPrice:"+ a[vt].getItemName()+ " "+a[vt].getItemPrice());
		a[vt].output();
	}

	public static void main(String[] args) {
		Bill b=new Bill();
		b.input();
		b.output();
		b.minPrice();
		b.maxPrice();

	}

}
