package array_of_integer;
//mac dinh tat ca moi lop trong java deu ke thua tu lop cha Ojbect
//k can ghi : extends Ojbect
public class ArrayOfInteger 
{
	private int n;
	private int []a;
	public ArrayOfInteger() {
		a=new int[4];
		n=0;
	}
	public ArrayOfInteger(int capacity) {
		if(capacity<0)
			a=new int[4];
		else
			a=new int[capacity];
		n=0;
	}
	public void add(int element)
	{
		//case 1: array is full, case2: array is not full
		if(n==a.length)
		{
			//new array
			int []b=new int[n*2];
			//copy all array to new array
			for(int i=0;i<n;i++)
				b[i]=a[i];
			a=b;
		}
		a[n]=element;
		n++;
	}
	public void addindex(int element,int index)
	{
		if(index<0||index>n)
			System.out.print("out of index");
		else
		{
			if(n==a.length)
			{
				int []b=new int[n*2];
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
				a[n-1]=0;
				n--;
		}
	}
	public boolean contains(int element)
	{
		for(int i=0;i<n;i++) {
			if(a[i]==element)
				return true;
		}
		return false;
	}
	public int indexOf(int element)
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
	public Integer get(int index)
	{
		if(index<0||index>n)
		{
			System.out.print("out of index");
			return null;
		}
		else return a[index];
		
	}
	public void set(int index,int element)
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
			s=s+" "+a[i];
		return s;
	}
	public void output() {
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args) 
	{
		ArrayOfInteger q=new ArrayOfInteger();
		q.add(1);
		q.add(5);
		q.add(4);
		q.add(8);
		q.add(3);
		q.add(7);
		q.add(9);
		q.remove(2);
		q.output();
		q.addindex(100,21);
		q.size();
		q.set(2, 100);
		System.out.println(q.contains(7));
		System.out.print(q.indexOf(7));
		System.out.print(q.toString());
	}
}
