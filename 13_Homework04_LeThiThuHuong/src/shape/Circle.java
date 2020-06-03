package shape;
import java.util.Scanner;
public class Circle extends Shape
{
	//cai dat thuoc tinh
	private double radier;
	public double getRadier() {
		return radier;
	}
	public void setRadier(double r) {
		if(r<0) this.radier=0;
		else this.radier=r;
	}
	//ham khoi tao khong doi so
	public Circle() {
		
	}
	//ham khoi tao co doi so
	public Circle(double r) {
		this.radier=r;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the radier:");
		this.setRadier(kb.nextDouble());
	}
	public void output() {
		System.out.println(this.radier);
	}
	//cac method
	public double area()
	{
		return 3.14*radier*radier;
	}
	
	public double perimeter()
	{
		return 2*3.14*radier;
	}

	public static void main(String[] args) {
		Circle c=new Circle();
		c.input();
		c.area();
		c.perimeter();

	}

}
