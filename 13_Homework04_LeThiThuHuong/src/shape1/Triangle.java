package shape1;
import java.util.Scanner;
public class Triangle implements Shape
{
	//cai dat thuoc tinh
	private double a,b,c;
	public double getA() {
		return a;
	}
	public void setA(double a) {
		if(a<0) this.a=0;
		else this.a=a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		if(b<0) this.b=0;
		else this.b=b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		if(c<0) this.c=0;
		else this.c=c;
	}
	//ham khoi tao khong doi so
	public Triangle() {
		
	}
	//ham khoi tao co doi so
	public Triangle(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a:");
		this.setA(kb.nextDouble());
		System.out.println("Enter b:");
		this.setB(kb.nextDouble());
		System.out.println("Enter c:");
		this.setC(kb.nextDouble());
	}
	@Override
	public void output() {
		System.out.println("Triangle: ");
		System.out.println("a"+this.a);
		System.out.println("b"+this.b);
		System.out.println("c"+this.c);
	}
	//cac method
	@Override
	public double area()
	{
		if( a+b>c && b+c>a && a+c>b) 
		{
			double p = (a + b + c)/2;
			return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		}
		else
		{
			System.out.println("It is not a triangle");
			return 0;
		}
	}
	@Override
	public double perimeter()
	{
		if(a+b>c && b+c>a && a+c>b) 
		{
			return a+b+c;
		}
		else 
		{
			System.out.println("It is not triangle");
			return 0;
		}
	}

	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.input();
		t.perimeter();
		t.area();
		

	}

}
