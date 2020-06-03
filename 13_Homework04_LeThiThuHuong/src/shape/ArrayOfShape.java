package shape;
import java.util.Scanner;
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
			System.out.println("1-Rectangle/2-Circle/3-Triangle");
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
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			a[i].output();
		}
	}
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
		int c1=0, c2=0, c3=0;
		for(int i=0;i<n;i++)
			if(a[i] instanceof Rectangle) c1++;
			else
				if(a[i] instanceof Circle) c2++;
				else c3++;
		System.out.println(c1+"\t"+c2+ "\t"+c3);
	}

	public static void main(String[] args) {
		ArrayOfShape s=new ArrayOfShape();
		s.input();
		s.output();
		s.count();
		System.out.println("areaMax: "+s.areaMax());
		System.out.println("perimeterMin:  "+ s.perimerterMin());

	}
}