package shape1;
import java.util.Scanner;
public class Cylinder extends Circle
{
	private double height;
	public double getHeight() {
		return height;
	}
	public void setHeight(double h) {
		if(h<0) this.height=0;
		else this.height=h;
	}
	public Cylinder() {
		super();
		this.height=0;
	}
	public Cylinder(double r,double h) {
		super();
		this.height=h;
	}
	@Override
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the height:");
		this.setHeight(kb.nextDouble());
		super.input();
	}
	@Override
	public void output() {
		System.out.println("Cylinder");
		System.out.println("height"+this.height);
		super.output();
	}
	@Override
	public double area() {
		return 2*3.14*radier*(radier+height);
	}
	//ham main dung chung cho moi doi tuong
	public static void main(String[] args) {
		Cylinder c=new Cylinder();
		c.input();
		c.output();

	}

}
