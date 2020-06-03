package polynomial;
import java.util.Scanner;
public class Polynomial 
{
	//khai bao bien
	private double coefficient;
	private int exponent;
	public double getCoefficient()
	{
		return coefficient;
	}
	public int getExponent()
	{
		return exponent;
	}
	public void setCoefficient(double c)
	{
		this.coefficient=c;
	}
	public void setExponent(int e)
	{
		if(e<0)this.exponent=0;
		else this.exponent=e;
	}
	//ham khoi tao khong doi so
	public   Polynomial() {
		exponent=0;
		
	}
	//ham khoi tao co doi so
	public   Polynomial(double c,int e) {
		setCoefficient(c);
		setExponent(e);
	}
	public void input()
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter Coefficient:");
		//this.setCoefficient(kb.nextDouble());thay cho 2 cau lenh phia duoi
		double c=kb.nextDouble();
		this.setCoefficient(c);
		
		System.out.println("Enter Exponent:");
		//this.setExponent(kb.nextInt());thay cho 2 cau lenh phia duoi
		int e=kb.nextInt();
		this.setExponent(e);
	}
	public void output()
	{
		System.out.println(this.coefficient + "x^" +  this.exponent);
	}
	public double f(double x)
	{
		return this.coefficient*Math.pow(x,this.exponent);
	}
	public double ff(double x)
	{
		return this.coefficient*this.exponent*Math.pow(x,this.exponent-1);
	}

	public static void main(String[] args) 
	{
		Polynomial p1=new Polynomial();
		p1.input();
		p1.output();
		System.out.println(p1.f(1) );

	}

}
