package array_of_fraction;
//mac dinh tat ca moi lop trong java deu ke thua tu lop cha Ojbect
//k can ghi : extends Ojbect
public class ArrayOfFraction 
{
	private int n;
	private Fraction []a;
	public ArrayOfFraction() {
		a=new Fraction[10];
		n=0;
	}
	public ArrayOfFraction(int capacity) {
		if(capacity<0)
			a=new Fraction[10];
		else
			a=new Fraction[capacity];
		n=0;
	}
	public void add(Fraction element)
	{
		//case 1: array is full, case2: array is not full
		if(n==a.length)
		{
			//new array
			Fraction []b=new Fraction[n*2];
			//copy all array to new array
			for(int i=0;i<n;i++)
				b[i]=a[i];
			a=b;
		}
		a[n]=element;
		n++;
	}
	public void addindex(Fraction element,int index)
	{
		if(index<0||index>n)
			System.out.print("out of index");
		else
		{
			if(n==a.length)
			{
				Fraction []b=new Fraction[n*2];
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
	public boolean contains(Fraction element)
	{
		for(int i=0;i<n;i++) {
			if(a[i]==element)
				return true;
		}
		return false;
	}
	public int indexOf(Fraction element)
	{
		for(int i=0;i<n;i++)
		{
			if(a[i]==element)
				return i;
		}
		return -1;
	}
	public int size()
	{
		return n;
	}
	public Fraction get(int index)
	{
		if(index<0||index>n)
		{
			System.out.print("out of index");
			return null;
		}
		else return a[index];
		
	}
	public void set(int index,Fraction element)
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
		ArrayOfFraction q=new ArrayOfFraction();
		q.add(  new Fraction(1,2));
		q.add(new Fraction(2,3));
		q.add(new Fraction(3,4));
		q.add(new Fraction(4,5));
		q.add(new Fraction(5,6));
/*
		q.remove(2);
		q.output();
		q.addindex(100,21);
		q.size();
		q.set(2, 100);
		System.out.println(q.contains(7));
		System.out.print(q.indexOf(7));*/
		System.out.print(q.toString());
	}
}
