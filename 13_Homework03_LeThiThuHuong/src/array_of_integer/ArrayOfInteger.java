package array_of_integer;

import java.util.Scanner;

public class ArrayOfInteger 
{
	private int n;
	private int []a=new int[100];
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n=n;
	}
	public ArrayOfInteger() { }
	public ArrayOfInteger(int n) {
		setN(n);
	}
	public void input() 
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter length of ArrayOfInteger:");
		this.setN(kb.nextInt());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a["+i+"]:");
			this.a[i]=kb.nextInt();
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public void printEven() {
		System.out.println("The Even:");
		for(int i=0;i<this.n;i++) {
			if(this.a[i]%2==0)
				System.out.print(this.a[i]+" ");
		}
		System.out.println();
	}
	public double oddAvg() {
		double sum=0,count=0;
		for(int i=0;i<this.n;i++) 
			if(a[i]%2==1) {
				sum+=a[i];
				count++;
			}
			if(count==0) return 0;
			return (int)(sum/count*100)/100.0;	
	}
	
	public int max() {
		int max=a[0];
		for(int i=0;i<this.n;i++) {
			if(max<this.a[i])
				max=this.a[i];
		}
		return max;
	}
	public void sumMax1() {
		int max=a[0]+a[1];
		int vt=0;
		for(int i=0;i<this.n;i++) {
			if(max<(this.a[i]+this.a[i+1])) {
				max=(this.a[i]+this.a[i+1]);
				vt=i;
			}
		}
		System.out.println(a[vt]);
		System.out.println(a[vt+1]);
		System.out.println(max);
	}
	public void sumMax2() {
		int vt1=0,vt2=1;
		int max2=a[0];
		for(int i=0;i<this.n-1;i++) {
			for(int j=i+1;j<this.n;j++) {
				if(max2<a[i]+a[j]) {
					max2=a[i]+a[j];
					vt1=i;
					vt2=j;
				}
			}
		}
		System.out.println(a[vt1]);
		System.out.println(a[vt2]);
		System.out.println(max2);
	}
	public void printPrine() {
		System.out.println("The printPrine:");
		for(int i=0;i<this.n;i++) {
			int d=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) 
					d++;
			}
			if(d==2)
				System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public boolean search (int x) {
		for(int i=0;i<n;i++) {
			if(a[i]==x)
				return true;
		}
		return false;
	}
	public void remove(int index) {
		for(int i=index;i<this.n-1;i++)
			a[i]=a[i+1];
		
		n--;
	
			for(int i=0; i<this.n;i++)
				System.out.print(a[i]+" ");
	}
	public void insert(int x, int index) {
		for(int i =n-1; i>=index; i--)
		{
			a[i+1]=a[i];
		}
		a[index]=x;
		n++; 
	}
	public void sort() {
		for(int i=0;i<this.n-1;i++) {
			for(int j=i+1;j<this.n;j++) {
				if(a[i]>a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
			for(int i=0;i<this.n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		ArrayOfInteger a=new ArrayOfInteger();
		a.input();
		a.output();
		a.printEven();
		System.out.println("The addavg:"+ a.oddAvg());
		System.out.println("The max:"+ a.max());
		System.out.println("The max1:");
		a.sumMax1();
		System.out.println("The max2:");
		a.sumMax2();
		a.printPrine();
		System.out.println(a.search(5));
		System.out.println();
		a.remove(3);
		System.out.println();
		a.insert(13,2);
		a.output();
		System.out.println();
		a.sort();
	}

}
