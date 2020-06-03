package point;
import java.util.Scanner;

public class Point 
{
	//khai bao bien
	private double x,y;
	public double getX()
	{
		return this.x;
	}
	public double getY() 
	{
		return this.y;
	}
	public void setX(double x) 
	{
		this.x=x;
	}
	public void setY(double y) 
	{
		this.y=y;
	}
	//ham khoi tao khong doi so
	public Point() { }
	//ham khoi tao co doi so
	public	Point(double x , double y) {
		setX(x);
		setY(y);
		
	}
	public void input () {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter x : ");
		double x=kb.nextDouble();
		setX(x);
	
		System.out.println("Enter y : ");
		double y=kb.nextDouble();
		setY(y);
	}
	public void output() {
		System.out.println("("+ this.x+";"+ this.y +")");
	}
	public double distence(Point b) {
		return Math.sqrt(Math.pow(b.x- this.x,2)+ Math.pow(b.y- this.y,2));
	}
	public double area(Point b, Point c) 
	{
		double ab,ac,bc,p;
		ab=this.distence(b);
		ac=this.distence(c);
		bc=b.distence(c);
		if( ab+ac>bc && ab+bc>ac && ac+bc>ab) 
		{
			p=(ab+ac+bc)/2;
			return Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
		}
		else return 0;
		
	}
	public double perimeter(Point b, Point c) 
	{
		double ab,ac,bc,p;
		ab=this.distence(b);
		ac=this.distence(c);
		bc=b.distence(c);
		if( ab+ac>bc && ab+bc>ac && ac+bc>ab) 
		{
			return ab+ac+bc;
		}
		else return 0;	
	}
	public static void main(String[] args) {
		double s;
		Point a= new Point();
		a.input();
		a.output();
		
		Point b= new Point();
		b.input();
		b.output();
		
		Point c =new Point();
		c.input();
		c.output();	
		System.out.println( s =a.area(b,c));
	}

}


