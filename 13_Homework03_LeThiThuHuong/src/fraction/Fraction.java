package fraction;
import java.util.Scanner;
public class Fraction 
{
	//khai bao thuoc tinh
	private int numerator,denominator;
	
	public int getNumerator()
	{
		return this.numerator;
	}
	public int getDenominator()
	{
		return this.denominator;
	}
	public void setNumerator(int n){ 
		this.numerator = n;
	}
	
	public void setDenominator(int d)
	{
		if(d==0)this.denominator=1;
		else this.denominator=d;
	}
	//ham khoi tao khong doi so
	public    Fraction() 
	{
		this.denominator=1;
	}
	//ham khoi tao co doi so
	public    Fraction(int n,int d)
	{
		this.numerator = n;
		this.denominator = d;
	}
	public void input() 
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter numerator:");
		int n=kb.nextInt();
		setNumerator(n);
		
		int d;
		do {
			System.out.println("Enter denominator:");
			d=kb.nextInt();
		}while(d==0);
		setDenominator(d);
	}
	public void output()
	{
		System.out.print(this.numerator +"/"+ this.denominator + "  ");
	}
	
	public Fraction plus(Fraction f2) 
	{
		Fraction f3=new Fraction();
		f3.numerator = (this.numerator*f2.denominator + this.denominator*f2.numerator);
		f3.denominator = (this.denominator*f2.denominator);
		return f3;
	}
	
	public Fraction subtraction(Fraction f2) 
	{
		Fraction f4=new Fraction();
		f4.setNumerator(this.numerator*f2.denominator - this.denominator*f2.numerator);
		f4.setDenominator(this.denominator*f2.denominator);
		return f4;
	}
	
	public Fraction multiplication(Fraction f2) 
	{
		Fraction f5=new Fraction();
		f5.setNumerator(this.numerator*f2.numerator);
		f5.setDenominator(this.denominator*f2.denominator);
		return f5;
	}
	
	public Fraction division(Fraction f2) 
	{
		Fraction f6=new Fraction();
		f6.setNumerator(this.numerator*f2.denominator );
		f6.setDenominator(this.denominator*f2.numerator);
		return f6;
	}
	
	public static void main(String[] args) 
	{
		Fraction f1=new Fraction();
		f1.input();
		f1.output();
		
		Fraction f2=new Fraction();
		f2.input();
		f2.output();
		
		Fraction f3=f1.plus(f2);
		f3.output();
		
		Fraction f4=f1.subtraction(f2);
		f4.output();
		
		Fraction f5=f1.multiplication(f2);
		f5.output();
		
		Fraction f6=f1.division(f2);
		f6.output();
	}

}
