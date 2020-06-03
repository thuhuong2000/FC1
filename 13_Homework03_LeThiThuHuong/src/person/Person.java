package person;
import java.util.Scanner;

public class Person 
{
	//khai bao bien
	private String fullName;
	private String phoneNumber;
	private boolean gender;
	private Address add=new Address();
	private Date dob=new Date();
	public Date getDate() {
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
		System.out.println(this.add);
		add.output();
		System.out.println(this.dob);
		dob.output();
	}
	public static void main(String[] args) 
	{
		
		Person p1=new Person();
		p1.input();
		p1.output();
		Address add=new Address();
		Date dob=new Date();
		
		Address add1=new Address();
		add.input();
		Person p2=new Person("Nam","146356",true,add1,dob);
		p2.output();
		
		Address add2=new Address("30","nguyen van linh","thanh khe","da nang");
		Person p3=new Person("me","123",false,add2,dob);
		
		Date dob1=new Date(01,01,2019);
		Address add3=new Address("01","nguyen van linh","thanh khe","da nang");
		Person p4=new Person("Hong","7847587",false,add3,dob1);
		
		Person p7=new Person("nu","858358",true,
				new Address("21","nguyuen van linh","thanh khe","da nang"),
				new Date(23,6,2001));
	}

}
