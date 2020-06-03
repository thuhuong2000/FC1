package employee;
import java.util.Scanner;
public class Person {
	//khai bao bien
	protected String fullName;
	protected String phoneNumber;
	protected boolean gender;
	protected Address add=new Address();
	protected Date dob=new Date();
	protected Date getDate() {
		return dob;
	}
	public void setDate(Date dob) {
		this.dob=dob;
	}
	public Address getAddress() {
		return add;
	}
	public void setAdd(Address add) {
		this.add=add;
	}

	public String getFullname() {
		return fullName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public boolean getGender() {
		return gender;
	}
	public void setFullName(String n)//gia su da co gia tri
	{
		this.fullName=n;
	}
	public void setPhoneNumber(String p) 
	{
		this.phoneNumber=p;
	}
	public void setGender(boolean g)
	{
		this.gender=g;
	}
	//ham khoi tao khong doi so
	public   Person()
	{
		this.fullName="";
		this.phoneNumber="";
	}
	//ham khoi tao co doi so
	public  Person(String n,String p,boolean g, Address add,Date dob)
	{
		this.fullName=n;
		this.phoneNumber=p;
		this.gender=g;
		this.add=add;
		this.dob=dob;
	}
	public void input()
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter fullName:");
		this.setFullName(kb.nextLine());
		
		System.out.println("Enter phoneNumber:");
		this.setPhoneNumber(kb.nextLine());
		
		System.out.println("You are female:");
		this.setGender(kb.nextBoolean());
		
		System.out.println("Enter Address:");
		add.input();
		
		System.out.println("Enter date of brith:");
		dob.input();
	}
	public void output()
	{
		System.out.println(this.fullName);
		System.out.println(this.phoneNumber);
		if(gender==false) 
		{
			System.out.println("Male");
		}
		else System.out.println("Female");
		System.out.println("Address");
		add.output();
		System.out.println("Day Of Birth");
		dob.output();
	}
	public static void main(String[] args) 
	{
		
		Person p1=new Person();
		p1.input();
		p1.output();
		Address add=new Address();
		Date dob=new Date();
		
	}

}

