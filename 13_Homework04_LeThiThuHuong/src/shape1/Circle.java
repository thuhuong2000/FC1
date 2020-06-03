package shape1;
import java.util.Scanner;
public class Circle implements Shape
{
	//cai dat thuoc tinh
	protected double radier;
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
	@Override
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the radier:");
		this.setRadier(kb.nextDouble());
	}
	@Override
	public void output() {
		System.out.println("Circle: ");
		System.out.println("Radier"+this.radier);
	}
	//cac method
	@Override
	public double area()
	{
		return 3.14*radier*radier;
	}
	@Override
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
