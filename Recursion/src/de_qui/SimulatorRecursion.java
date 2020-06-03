package de_qui;


import java.util.Stack;

public class SimulatorRecursion {
	public static long factorial(int n)
	{
		int f = 1;
		Stack<Integer> s = new Stack<Integer>();
		while(n!=0)
			s.push(n--);
		while(!s.isEmpty())
			f*=s.pop();
		return f;
	}
	public static void boiso(int n,int m)
	{
		Stack<Integer> huy = new Stack<Integer>();
		while(n > 0)
		{
			huy.push(n-m);
			n-=m;
		}
		if(huy.peek() == 0)
			System.out.println("La boi so cua "+m);
		else System.out.println("Khong la boi so cua "+m);
			
	}
	public static int sum(int n)
	{
		int sum = 0;
		Stack<Integer> s = new Stack<Integer>();
		while(n > 0)
			s.push(n--);
		while(!s.isEmpty())
			sum+=s.pop();
		return sum;
	}
	public static int sumOll(int n)
	{
		int sum = 0;
		Stack<Integer> s = new Stack<Integer>();
		n = n % 2 == 0 ? n-1 : n;
		while(n > 0)
		{
			s.add(n);
			n-=2;
		}
		while(!s.isEmpty())
			sum+=s.pop();
		return sum;
	}
	public static String doiHe(int n,int k)
	{
		String s = "";
		Stack<Integer> huy = new Stack<Integer>();
		while(n!=0)
		{
			huy.add(n%k);
			n/=k;
		}
		while(!huy.isEmpty())
			if(huy.peek() < 10)
				s+=huy.pop();
			else s+= (char)(huy.pop() +55);
		return s;
	}
	public static String reverse(String s)
	{
		String str = "";
		Stack<Character> dao = new Stack<Character>();
		for(int i = 0 ; i < s.length() ; i++)
			dao.add(s.charAt(i));
		while(!dao.isEmpty())
			str+=dao.pop();
		return str;
	}
	public static int layDu(int n,int k)
	{
		Stack<Integer> huy = new Stack<Integer>();
		if(k == 0 || n == 0)
			return 0;
		while(n >= k)
		{
			huy.add(n-=k);
		}
		return huy.peek();
	}
	//
	public static int layNguyen(int n,int k)
	{
		Stack<Integer> huy = new Stack<Integer>();
		
		if(k == 0 || n == 0)
			return 0;
		while(n >= k)
		{
			huy.add(n-=k);
		}
		
		int s = 0;
		while(!huy.isEmpty())
		{
			huy.pop();
			s++;
		}
		return s;
	}
	//mu 2
	public static int mu(int n)
	{
		int s = 0;
		Stack<Integer> h = new Stack<Integer>();
		h.add(n);
		while(!h.isEmpty())
		{	
			if(h.peek() == 0)
			{
				s+=1;
				h.pop();
			}
			else {
				int tmp = h.pop()-1;
				h.add(tmp);
				h.add(tmp);
			}
		}
		return s;
	}
	//x mu y
	public static int mu(int x,int y)
	{
		if(x == 0)
			return 0;
		if(y == 0)
			return 1;
		int s = 1;
		Stack<Integer> t = new Stack<Integer>();
		for(int i = 0 ; i < y ; i++)
			t.add(x);
		while(!t.isEmpty())
			s*=t.pop();
		return s;
	}
	public static void main(String[] args) {
		System.out.println(reverse("lriG olleH"));
		System.out.println(reverse("4321"));
		System.out.println(factorial(4));
		System.out.println(layDu(23,5));
	}

}