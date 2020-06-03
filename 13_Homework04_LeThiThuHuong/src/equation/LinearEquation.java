package equation;

import java.util.Scanner;

public class LinearEquation 
{

	//khai bao bien
		protected double b, c;
		
		//goi ham khoi tao khong doi so
		public   LinearEquation()
		{
			b=4;
			c=2;
		}
		
		//goi ham khoi tao co doi so
		public   LinearEquation(double b, double c) 
		{
			setB(b);
			setC(c);
		}
		
		public double GetB() {
			return b;
		}
		
		public double GetC() {
			return c;
		}
		
		public void setB(double b) { 
			setB(b);
		}
		
		public void setC(double c) { 
			setC(c);
		}
		public void input() {
			Scanner kb=new Scanner(System.in);
			System.out.println("Enter b:");
			this.b=kb.nextDouble();
			System.out.println("Enter c:");
			this.c=kb.nextDouble();
		}
		//cai dat phuong thuc
		public void solve()
		{
			if(b == 0) 
				if(c==0)
					System.out.println("Unlimited roots");
				else
					System.out.println("no root");
			else
				System.out.println(" x = "+ (-c/b));			
		}
		public void f(int a,int b) {
			System.out.println(a-b);
		}
		public void f1(int a,int b,int c) {
			System.out.println(a-b-c);
		}

		public static void main(String[] args) 
		{
			//tao ra cac doi tuong co gai tri rieng biet
			LinearEquation p1=new LinearEquation();//goi ham khoi tao khong doi so
			p1.solve();
			
			LinearEquation p2=new LinearEquation();
			p2.b= 0;
			p2.c= 2;
			p2.solve();
			
			LinearEquation p3=new LinearEquation(1,5);//goi ham khoi tao co doi so
			p3.solve();

		}

	}
