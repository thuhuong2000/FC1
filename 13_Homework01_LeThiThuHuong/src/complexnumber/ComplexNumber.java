package complexnumber;
import java.util.Scanner;

import fraction.Fraction;

public class ComplexNumber 
{
	//khai bao bien
	private double real,virtual;
	public double getReal()
	{
		return real;
	}
	public double getVirtual()
	{
		return virtual;
	}
	public void setReal(double r) 
	{
		this.real=r;
	}
	public void setVirtual(double v)
	{
		this.virtual=v;
	}
	//ham khoi tao khong doi so
	public  ComplexNumber()
	{
		
	}
	//ham khoi tao co doi so
	public  ComplexNumber(double r,double v)
	{
		this.real=r;
		this.virtual=v;
	}
	public void input()
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter real:");
		double r=kb.nextDouble();
		setReal(r);
		
		System.out.println("Enter b:");
		double v=kb.nextDouble();
		setVirtual(v);
	}
	public void output()
	{
		System.out.println(this.real +"+"+ this.virtual +"i");
	}
	
	public ComplexNumber plus(ComplexNumber p2) 
	{
		ComplexNumber p3=new ComplexNumber();
		p3.real = (this.real+p2.real );
		p3.virtual = (this.getVirtual()+p2.getVirtual());
		return p3;
	}
	public ComplexNumber subtraction(ComplexNumber p2) 
	{
		ComplexNumber p4=new ComplexNumber();
		p4.real = (this.getReal()-p2.getReal() );
		p4.virtual = (this.getVirtual()-p2.getVirtual());
		return p4;
	}
	public ComplexNumber multiplication(ComplexNumber p2) 
	{
		ComplexNumber p5=new ComplexNumber();
		p5.real = ((this.getReal()*p2.getReal()) - (this.getVirtual()*p2.getVirtual()) );
		p5.virtual = ((this.getReal()*p2.getVirtual()) + (this.getReal()*p2.getVirtual()) );
		return p5;
	}
	
	public ComplexNumber division(ComplexNumber p2) 
	{
		ComplexNumber p6=new ComplexNumber();
		p6.real = (((this.getReal()*p2.getReal()) + (this.getVirtual()*p2.getVirtual())) / (p2.getReal()*p2.getReal() + p2.getVirtual()*p2.getVirtual()) );
		p6.virtual = (((this.getReal()*p2.getVirtual()) - (this.getReal()*p2.getVirtual())) / (p2.getReal()*p2.getReal() + p2.getVirtual()*p2.getVirtual()) );
		return p6;
	}

	public static void main(String[] args) 
	{
		ComplexNumber p1=new ComplexNumber();
		p1.input();
		p1.output();
		
		ComplexNumber p2=new ComplexNumber(3,4);
		p2.output();
		
		ComplexNumber p3=p1.plus(p2);
		p3.output();
		
		ComplexNumber p4=p1.subtraction(p2);
		p4.output();
		
		ComplexNumber p5=p1.multiplication(p2);
		p5.output();
		
		ComplexNumber p6=p1.division(p2);
		p6.output();
		

	}

}
