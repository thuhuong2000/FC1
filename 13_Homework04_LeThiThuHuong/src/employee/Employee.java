package employee;
import java.util.Scanner;
//lop truu tuong bao gom phuong thuc co body va tuu tuong k co body
public abstract class Employee extends Person
{
	protected String id;
	protected String jobTitle;
	protected double allowance;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jt) {
		this.jobTitle=jt;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double alw) {
		this.allowance=alw;
	}
	public  Employee() {
		super();		//goi ham khoi tao khong doi so cua class person
		this.id="";
		this.jobTitle="";
	}
	public Employee(String n,String p,boolean g, Address add,Date dob,String id,String jt,double alw) {
		super(n,p,g,add,dob);	//goi ham khoi tao co doi so cua class person
		this.id=id;
		this.jobTitle=jt;
		this.allowance=alw;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the id:");
		this.setId(kb.nextLine());
		System.out.println("Enter the job title:");
		this.setJobTitle(kb.nextLine());
		System.out.println("Enter allowance:");
		this.setAllowance(kb.nextDouble());
		super.input();		//goi ham input cua class person
	}
	public void output() {
		System.out.println(this.id);
		System.out.println(this.jobTitle);
		System.out.println(this.allowance);
		super.output();		//goi ham output cua lop person
	}
	//
	public abstract double payRoll();

	public static void main(String[] args) {
		Employee e=new Employee();	//lop truu tuong k dc new chinh no ma phai new thong qua lop con no
		e.input();
		e.output();

	}

}
