package arrayOfInteger;
import java.util.Scanner;
public class ArrayOfInteger {
	private int []a=new int[100];
	private int n;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n=n;
	}
	public ArrayOfInteger() {
		
	}
	public ArrayOfInteger(int n) {
		setN(n);
	}
	public void input() {
	
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter n: ");
		this.setN(kb.nextInt());
		for(int i=0;i<this.n;i++) {
			System.out.println("a["+ i + "] :");
			a[i]=kb.nextInt();
	}
}
	public void output() {
		for(int i=0;i<this.n;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	public int plus() {
		int s=0;
		for(int i=0;i<this.n;i++) {
			s=s+a[i];
		}
		return s;
	}
	public void printEven() {
		for(int i=0;i<this.n;i++) {
			if(a[i]%2==0)
				System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public double odcAvg() {
		double s=0;
		for(int i=0;i<this.n;i++) {
			s=s+a[i];
		}
		return s/n;
	}
	public int max() {
		int max=a[0];
		for(int i=1;i<this.n;i++) {
			if(max<a[i])
				max=a[i];
		}
		return max;
	}
	public int max2() {
		int max2=a[0];
		for(int i=0;i<this.n;i++) {
			if(max2<a[i]&&a[i]<max())
				max2=a[i];
		}
		return max2;
	}
	public void printPrine() {
		for(int i=0;i<this.n;i++) {
			int d=0;
			for(int k=1;k<=a[i];k++) {
				if(a[i]%k==0) 
					d=d+1;
			}
			if(d==2)
				System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayOfInteger b=new ArrayOfInteger();
		b.input();
		b.output();
		System.out.println("Plus:" +b.plus());
		System.out.println("Even:");
		b.printEven();
		System.out.println("Avg: " + b.odcAvg());
		System.out.println("max:" + b.max());
		System.out.println("max2:" + b.max2());
		b.printPrine();
	}
}