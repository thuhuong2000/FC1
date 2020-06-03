package de_qui;

public class Recursion 
{
	public static long factorial(int n) {
		if(n==0) return 1;
		else return n*factorial(n-1);
	}
	public static void BoiSo(int n) {
		if(n<0)
			System.out.println("NO");
		else
			if(n==0) System.out.println("Yes");
			else BoiSo(n-7);
		
	}
	public static long UCLN(int a,int b) {
		if(a==0||b==0) return a+b;
		else
			if(a==b) return a;
			else
				if(a>b) return UCLN(a-b,b);
				else return UCLN(a,b-a);
	}
	
	public static long laydu(int a , int b) {
		if(a==0) return 0;
		if(a>=b) return laydu(a-b,b);
		else return a;
	}
	
	public static long thuong(int a,int b) {
		if(a==0||a<b) return 0;
		if(a==b) return 1;
		else return 1+thuong(a-b,b);
	}
	public static long luythua(int n) {
		if(n==0) return 1;
		else return 2*luythua(n-1);
	}

	public static void main(String[] args) {
		//Recursion.factorial(5);
		System.out.println(Recursion.factorial(5));
		Recursion.BoiSo(12384);
		System.out.println(Recursion.laydu(17, 4));
		System.out.println(Recursion.UCLN(125,75));
		System.out.println(Recursion.thuong(16, 4));
		System.out.println(Recursion.luythua(3));
	}

}
