package employee;
import java.util.Scanner;
public class Regular extends Employee
{
	private int yearsOfExperience;
	private double rate,basicSalary;
	public int getyearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yoe) {
		if(yoe<0) this.yearsOfExperience=0;
		else  this.yearsOfExperience=yoe;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double r) {
		if(r<0) this.rate=0;
		else this.rate=r;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double bl) {
		if(bl<0) this.basicSalary=0;
		else this.basicSalary=bl;
	}
	public Regular() {
		super();	//goi ham khoi tao khong doi so cua lop employee
		this.yearsOfExperience=0;
		this.rate=0;
		this.basicSalary=0;
	}
	public Regular(String n,String p,boolean g, Address add,Date dob,String id,String jt,double alw,int yoe,double r,double bl) {
		super(n,p,g,add,dob,id,jt,alw);		//goi ham khoi tao co doi so cua lop employee
		this.yearsOfExperience=yoe;
		this.rate=r;
		this.basicSalary=bl;
	}
	@Override
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the years of experience:");
		this.setYearsOfExperience(kb.nextInt());
		System.out.println("The rate:");
		double rate1=2.33;
		for(int i=1;i<9;i++) {
			if(this.yearsOfExperience<25) {
				if(this.yearsOfExperience>3*i) {
					rate1=rate1+0.33;
				}
			}
			else rate1=2.33+8*0.33;
		}
		System.out.println(rate1);
		System.out.println("Enter the basic salary:");
		this.setBasicSalary(kb.nextDouble());
		super.input(); 			//goi ham input cua lop employee
	}
	@Override
	public void output() {
		System.out.println(this.yearsOfExperience);
		System.out.println(this.rate);
		System.out.println(this.basicSalary);
		super.output();
	}
	@Override
	public double payRoll() {
		return (this.rate*this.basicSalary)+this.allowance;
	}

	public static void main(String[] args) {
		Regular r=new Regular();
		r.input();
		r.output();
		System.out.println(r.payRoll());

	}

}
