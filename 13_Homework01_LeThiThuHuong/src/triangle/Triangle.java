package triangle;

public class Triangle 
{
	//khai bao bien
	private double a, b, c;
	
	//goi ham khoi tao khong doi so
	public  Triangle() {
		a=3;
		b=4;
		c=6;
	}
	
	//goi ham khoi tao co doi so
	public  Triangle(double d,double e,double f) {
		setA(d);
		setB(e);
		setC(f);
		
	}
	
	public double getA() {
		return a;
	}
	
	public double GetB() {
		return b;
	}
	
	public double GetC() {
		return c;
	}
	
	public void setA(double a1) {
		if(a<0)a1 = 0;
		else
			a = a1;
	}
	
	public void setB(double b1) {
		if(b<0)b1=0;
		else
			b=b1;
	}
	
	public void setC(double c1) {
		if(c<0)c1=0;
		else
			c=c1;
	}
	//cai dat phuong thuc
	public Double area()
	{
		if( a+b>c && b+c>a && a+c>b) 
		{
			double p = (a + b + c)/2;
			return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		}
		else
		{
			System.out.println("It is not a triangle");
			return null;
		}
	}
	public Double perimeter()
	{
		if(a+b>c && b+c>a && a+c>b) 
		{
			return a+b+c;
		}
		else 
		{
			System.out.println("It is not triangle");
			return null;
		}
	}
	public static void main(String[] args) 
	{
		//tao cac doi tuong co gai tri cu the rieng biet
		Triangle t1 = new Triangle();//goi ham khoi tao khong doi so
		System.out.println(t1.area() );
		System.out.println(t1.perimeter() );
		
		Triangle t2 = new Triangle(6,8,10);//goi ham khoi tao doi so
		System.out.println(t2.area() );
		System.out.println(t2.perimeter() );
	}

}
