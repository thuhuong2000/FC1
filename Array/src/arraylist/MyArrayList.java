package arraylist;

import array_of_fraction.Fraction;

//mac dinh tat ca moi lop trong java deu ke thua tu lop cha Ojbect
//k can ghi : extends Ojbect
public class MyArrayList<E>
{
	private int n;
	private E []a;
	public MyArrayList() {
		a=(E[]) new Object[10];
		n=0;
	}
	public MyArrayList(int capacity) {
		if(capacity<0)
			a=(E[]) new Object[10];
		else
			a=(E[]) new Object[capacity];
		n=0;
	}
	public void add(E element)
	{
		//case 1: array is full, case2: array is not full
		if(n==a.length)
		{
			//new array
			E []b=(E[]) new Object[n*2];
			//copy all array to new array
			for(int i=0;i<n;i++)
				b[i]=a[i];
			a=b;
		}
		a[n]=element;
		n++;
	}
	public void addindex(E element,int index)
	{
		if(index<0||index>n)
			System.out.print("out of index");
		else
		{
			if(n==a.length)
			{
				E []b=(E[]) new Object[n*2];
				System.arraycopy(a,0,b,0,n);
				a=b;
			}
			for(int i=n;i>index;i--)
				a[i]=a[i-1];
			a[index]=element;
			n++;
		}
	}
	public void remove(int index)
	{
		if(index<0||index>=n)
			System.out.print("out of index");
		else
		{
			if(n==0) System.out.print("list is empty");
			else
				for(int i=index;i<n-1;i++)
					a[i]=a[i+1];
			//	a[n-1]=0;
				n--;
		}
	}
	public boolean contains(E element)
	{
		for(int i=0;i<n;i++) {
			if(a[i].equals(element))
				return true;
		}
		return false;
	}
	public int indexOf(E element)
	{
		for(int i=0;i<n;i++)
		{
			if(a[i].equals(element))
				return i;
		}
		return -1;
	}
	public int size()
	{
		return n;
	}
	public E get(int index)
	{
		if(index<0||index>n)
		{
			System.out.print("out of index");
			return null;
		}
		else return a[index];
		
	}
	public void set(int index,E element)
	{
		if(index<0||index>n)
			System.out.print("out of index");
		else
			a[index]=element;
	}
	@Override
	public String toString() {
		String s="";
		for(int i=0;i<n;i++)
			s=s+"	 "+a[i];
		return s;
	}
	public void output() {
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args) 
	{
		//goi lop khuon mau MyArrayLisst,dua doi tuong fraction
		MyArrayList<Fraction> arr=new MyArrayList<Fraction>();
		arr.add(  new Fraction(1,2));
		arr.add(new Fraction(2,3));
		arr.add(new Fraction(3,4));
		arr.add(new Fraction(4,5));
		arr.add(new Fraction(5,6));
		System.out.println(arr.toString());
		
		//goi lop khuon mau MyArrayLisst,dua doi tuong integer
		MyArrayList<Integer> q=new MyArrayList<Integer>();
		q.add(1);
		q.add(5);
		q.add(4);
		q.add(8);
		q.add(3);
		System.out.println(q.toString());
		
		//goi lop khuon mau MyArrayLisst,dua doi tuong double
		MyArrayList<Double> arr1=new MyArrayList<Double>();
		arr1.add(1.5);
		arr1.add(5.4);
		arr1.add(4.2);
		arr1.add(8.1);
		arr1.add(3.3);
		System.out.println(arr1.toString());
/*
		q.remove(2);
		q.output();
		q.addindex(100,21);
		q.size();
		q.set(2, 100);
		System.out.println(q.contains(7));
		System.out.print(q.indexOf(7));
		System.out.print(q.toString());*/
	}
}
