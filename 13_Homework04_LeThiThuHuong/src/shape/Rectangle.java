package shape;
import java.util.Scanner;
public class Rectangle extends Shape
{
	//cai dat thuoc tinh
	private double length,width;
	public double getLength() {
		return length;
	}
	public void setLength(double l) {
		if(l<0) this.length=0;
		else this.length=l;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double w) {
		if(w<0) this.width=0;
		else this.width=w;
	}
	//ham khoi tao khong doi so
	public Rectangle() {
		
	}
	//ham khoi tao co doi so
	public Rectangle(double l,double w) {
		this.length=l;
		this.width=w;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the Length:");
		this.setLength(kb.nextDouble());
		System.out.println("Enter the width:");
		this.setWidth(kb.nextDouble());
	}
	public void output() {
		System.out.println(this.length);
		System.out.println(this.width);
	}
	//cac method
	public double area()
	{
		return length*width;
	}
	
	public double perimeter()
	{
		return (length + width)*2;
	}

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.input();
		r.output();
		r.area();
		r.perimeter();
	}

}
