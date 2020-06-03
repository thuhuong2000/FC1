package equation;
import java.util.Scanner;
public class SquareEquation extends LinearEquation
{
	//khai bao bien
		private double a;
			
		//goi ham khoi tao khong doi so
		
		public  SquareEquation() {
			super();//goi ham khoi tao cua lop cha
			//luon nam dau tien trong ham khoi tao cua con
			}
			
		//goi ham khoi tao co doi so
		
		public  SquareEquation(double a,double b,double c) 
		{
			super(b,c);//goi ham khoi tao co doi so cua lop cha
						//luon nam dau tien trong ham khoi tao cua con
			setA(a);		
			}
			
		public double getA() {
				return a;
			}
		public void setA(double a) {
				this.a=a;
		}
		public void input() {
			Scanner kb=new Scanner(System.in);
			System.out.println("Enter a:");
			this.a=kb.nextDouble();
			super.input();//goi ham input cua lop cha
		}
		
		//cai dat phuong thuc
		public void slove()
		{
			if(a==0)
				super.solve();//goi ham slove cua lop cha
			else 
				if((b*b-4*a*c) < 0)
				System.out.println("Unlimited roots");
				else if((b*b-4*a*c) == 0)
				System.out.println(" x = "+ (-b/2*a));
					else 
					{
						System.out.println("x1 = "+ (-b+Math.sqrt(b*b-4*a*c))/2*a);
						System.out.println("x2 = "+ (-b-Math.sqrt(b*b-4*a*c))/2*a);
					}
		}
		@Override
		public void f(int a,int b) {
			System.out.println(a+b);
		}
		public void f1(double a,double b) {
			System.out.println(a+b);
		}
		public void f2(double a,double b,double c) {
			System.out.println(a+b+c);
		}

		public static void main(String[] args) 
		{
			//tao ra cac doi tuong co gia tri rieng biet
			
			SquareEquation r1=new SquareEquation();
			r1.input();
			r1.slove();
			
			
		}

	}

