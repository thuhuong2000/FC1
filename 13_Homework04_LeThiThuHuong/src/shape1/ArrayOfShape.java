package shape1;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
public class ArrayOfShape 
{
	private int n;
	private Shape []a=new Shape [100];
	public int getN() {
		return n;
	}
	public void setN(int n) {
		if(n<0) this.n=0;
		else this.n=n;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the long array:");
		this.setN(kb.nextInt());
		for(int i=0;i<n;i++) {
			System.out.println("Enter the shape"+i+":");
			System.out.println("1-Rectangle/2-Circle/3-Triangle/4-Square");
			int choose=kb.nextInt();
			if(choose==1) {
				Shape s=new Rectangle();
				s.input();
				a[i]=s;
			}
			else
				if(choose==2) {
					Shape s=new Circle();
					s.input();
					a[i]=s;
				}
				else
					if(choose==3) {
						Shape s=new Triangle();
						s.input();
						a[i]=s;
					}
					else 
						if (choose==4) {
							Shape s=new Square();
							s.input();
							a[i]=s;
						}
			}
	}
	public void readFile() throws FileNotFoundException {
		Scanner kb=new Scanner(new File("src/shape1/input.txt"));
		while(kb.hasNextLine()==true) {
			String str=kb.next();
			if(str.compareTo("Rectangle")==0) {
				Shape s= new Rectangle(kb.nextInt(),kb.nextInt());
				a[n]=s;
				n++;
			}
			else
				if(str.compareTo("Circle")==0) {
					Shape s= new Circle(kb.nextDouble());
					a[n]=s;
					n++;
				}
				else
					if(str.compareTo("Triangle")==0) {
						Shape s=new Triangle(kb.nextInt(),kb.nextInt(),kb.nextInt());
						a[n]=s;
						n++;
					}
					else
						if(str.compareTo("Square")==0) {
							Shape s=new Square(kb.nextInt());
							a[n]=s;
							n++;
						}
		}
	}

	public void output() {
		for(int i=0;i<n;i++) {
			a[i].output();
		}
	}
	public void sortArea()
	{
		for(int i = 0 ; i < n ; i++)
			for(int j = 0 ; j < n - 1 ; j++)
			{
				if(a[i].area() > a[j].area())
				{
					Shape t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
	}
	public void write() throws FileNotFoundException
	{
		PrintStream p = new PrintStream(new File("src/shape1/o.txt"));
		for(int i = 0 ; i < n ; i++)
		{
			if(a[i] instanceof Triangle)
			{
				p.append("The area of triangle : "+a[i].area()+"\n");
			}
			else if(a[i] instanceof Square)
			{
				p.append("The area of square : "+a[i].area()+"\n");
			}
			else if(a[i] instanceof Circle)
			{
				p.append("The area of circle : "+a[i].area()+"\n");
			}
			else if(a[i] instanceof Rectangle)
			{
				p.append("The area of rectangle : "+a[i].area()+"\n");
			}
		}
			
	}
	/*
	public double  areaMax() {
		double max= a[0].area(); // tinh da hinh
		for(int i=1;i<n;i++)
			if(max<a[i].area())// tinh da hinh
				max=a[i].area();// tinh da hinh
		return max;
	}
	public double  perimerterMin() {
		double min= a[0].perimeter(); // tinh da hinh
		for(int i=1;i<n;i++)
			if(min>a[i].perimeter())// tinh da hinh
				min=a[i].perimeter();// tinh da hinh
		return min;
	}
	public void count() {
		int c1=0, c2=0, c3=0,c4=0;
		for(int i=0;i<n;i++)
			if(a[i] instanceof Rectangle) c1++;
			else
				if(a[i] instanceof Circle) c2++;
				else 
					if(a[i] instanceof Triangle) c3++;
					else c4++;
		System.out.println(c1+"\t"+c2+ "\t"+c3+"\t"+c4);
	}*/

	public static void main(String[] args) throws FileNotFoundException {
		ArrayOfShape arr=new ArrayOfShape();
		//s.input();
		arr.readFile();
		arr.output();
		arr.sortArea();
		arr.write();
	//	arr.count();
		//System.out.println("areaMax: "+arr.area());
	//	System.out.println("perimeterMin:  "+ arr.perimerterMin());

	}
}