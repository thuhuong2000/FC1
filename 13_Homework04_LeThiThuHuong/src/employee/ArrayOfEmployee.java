package employee;
import java.util.Scanner;
public class ArrayOfEmployee 
{
	private int n;
	private Employee []a=new Employee[100];
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
			System.out.println("Enter employee"+i+":");
			System.out.println("1-Regular/2-Contract");
			int choose=kb.nextInt();
			if(choose==1) {
				Employee e=new Regular();
				e.input();//tinh da hinh
				a[i]=e;
			}
			else
				if(choose==2) {
					Employee e=new Contract();
					e.input();//tinh da hinh
					a[i]=e;
				}
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			a[i].output();//tinh da hinh
		}
	}
	public double payRoll() {
		double max=a[0].payRoll();//tinh da hinh
		for(int i=1;i<n;i++) {
			if(max<a[i].payRoll())
				max=a[i].payRoll();
		}
		return max;
	}

	public static void main(String[] args) {
		ArrayOfEmployee p=new ArrayOfEmployee();
		p.input();
		p.output();
		p.payRoll();

	}

}
