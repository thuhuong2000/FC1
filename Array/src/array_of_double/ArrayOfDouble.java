package array_of_double;

public class ArrayOfDouble {

		private int n;
		private double []a;
		public ArrayOfDouble() {
			a=new double[4];
			n=0;
		}
		public ArrayOfDouble(int compacity) {
			if(compacity<0)
				a=new double[4];
			else
				a=new double[compacity];
			n=0;
		}
		public void add(double element)
		{
			if(n==a.length)
			{
				double []b=new double[n*2];
				for(int i=0;i<n;i++)
					b[i]=a[i];
				a=b;
			}
			a[n]=element;
			n++;
		}
		public void addindex(double element,int index)
		{
			if(index<0||index>n)
				System.out.print("out of index");
			else
			{
				if(n==a.length)
				{
					double []b=new double[n*2];
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
		public boolean contains(double element)
		{
			for(int i=0;i<n;i++) {
				if(a[i]==element)
					return true;
			}
			return false;
		}
		public int indexOf(double element)
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
		public Double get(int index)
		{
			if(index<0||index>n)
			{
				System.out.print("out of index");
				return null;
			}
			else return a[index];
			
		}
		public void set(int index,double element)
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
			ArrayOfDouble q=new ArrayOfDouble();
			q.add(1.5);
			q.add(5.4);
			q.add(4.2);
			q.add(8.1);
			q.add(3.3);
			q.add(7.9);
			q.add(9.3);
			q.remove(2);
			q.output();
			q.addindex(10.1,7);
			q.size();
			q.set(2, 10.1);
			System.out.println(q.contains(7));
			System.out.print(q.indexOf(7));
			System.out.print(q.toString());

	}

}
