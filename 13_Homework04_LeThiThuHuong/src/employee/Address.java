package employee;
import java.util.Scanner;
public class Address {
	//khai bao thuoc tinh
		private String number,street,district,city;
		public String getNumber()
		{
			return number;
		}
		public String getStreet()
		{
			return street;
		}
		public String getDistrict()
		{
			return district;
		}
		public String getCity()
		{
			return city;
		}
		public void setNumber(String n) {
			this.number=n;
		}
		public void setStreet(String s) {
			this.street=s;
		}
		public void setDistrict(String d) {
			this.district=d;
		}
		public void setCity(String c) {
			this.city=c;
		}
		//ham khoi tao khong doi so
		public  Address() { 
			this.number="";
			this.street="";
			this.district="";
			this.city="";
		}
		//ham khoi tao co doi so
		public  Address(String n,String s, String d, String c) //gia su da co gia tri
		{
			this.number=n;
			this.street=s;
			this.district=d;
			this.city=c;
		}
		public void input() {
			Scanner kb=new Scanner(System.in);
			System.out.println("Enter Number:");
			this.setNumber(kb.nextLine() );
			System.out.println("Enter street:");
			this.setStreet(kb.nextLine());
			System.out.println("Enter District:");
			this.setDistrict(kb.nextLine() );
			System.out.println("Enter City:");
			this.setCity(kb.nextLine() );
			
		}
		public void output()
		{
			System.out.println(this.number+","+this.street+","+this.district+","+this.city);
		}

		public static void main(String[] args) 
		{
			Address a=new Address();
			a.input();
			a.output();

		}
}


