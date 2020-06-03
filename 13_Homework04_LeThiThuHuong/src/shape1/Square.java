package shape1;
import java.util.Scanner;
public class Square extends Rectangle
{
	//khong co thuoc tinh vi thua ke thuoc tinh tu lop cha Rectangle
	public Square() {
		super();
	}
	public Square(double edge) {
		super(edge,edge);
	}
	@Override
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter edge:");
		width=length=kb.nextDouble();
	}
	@Override
	public void output() {
		System.out.println("Square: ");
		System.out.println("Edge"+width);
	}

	public static void main(String[] args) {
		Square s=new Square();
		s.input();
		s.output();
		System.out.println(s.area());
		System.out.println(s.perimeter());
	}

}
