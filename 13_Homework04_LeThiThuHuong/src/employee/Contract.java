package employee;
import java.util.Scanner;
public class Contract extends Employee
{
	private double gradeSalary;
	public double getGradeSalary() {
		return gradeSalary;
	}
	public void setGradeSalary(double gradeSalary) {
		if(gradeSalary<0) this.gradeSalary=0;
		else this.gradeSalary=gradeSalary;
	}
	public Contract() {
		super(); 		//goi ham khoi tao khong doi so cua lop employee
		this.gradeSalary=0;
	}
	public Contract(String n,String p,boolean g, Address add,Date dob,String id,String jt,double alw,double gradeSalary) {
		super(n,p,g,add,dob,id,jt,alw); 	//goi ham khoi tao co doi so cua lop employee
		this.gradeSalary=gradeSalary;
	}
	@Override
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the gradesalary:");
		this.setGradeSalary(kb.nextDouble());
		super.input(); 			//goi ham input cua lop empolyee
	}
	@Override
	public void output() {
		System.out.println(this.gradeSalary);
		super.output(); 		//goi ham output cua lop employee
	}
	@Override
	public double payRoll() {
		return this.gradeSalary+this.allowance;
	}

	public static void main(String[] args) {
		Contract c=new Contract();
		c.input();
		c.output();
		System.out.println(c.payRoll());

	}

}
