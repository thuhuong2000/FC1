package candidate;
import java.util.Scanner;
public class Candidate {
	private double testMark1,testMark2,testMark;
	private int codeID;
	private String name;
	private Date dob=new Date();
	private Address add=new Address();
	public double getTestMark() {
		return this.testMark;
	}
	public void setTestMark(double tM ) {
		if(testMark<0 && testMark>10) tM=0;
		else this.testMark=tM;
	}
	public double getTestMark1() {
		return testMark1;
	}
	public void setTestMark1(double tM1 ) {
		if(testMark1<0 && testMark1>10) tM1=0;
		else this.testMark1=tM1;
	}
	public double getTestMark2() {
		return testMark2;
	}
	public void setTestMark2(double tM2 ) {
		if(testMark2<0 && testMark2>10) tM2=0;
		else this.testMark2=tM2;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name=n;
	}
	public int getCodeID() {
		return codeID;
	}
	public void setCodeID(int id) {
		this.codeID=id;
	}
	//ham khoi tao khong doi so
	public Candidate() {
		this.name=" ";
	}
	//ham khoi tao co doi so
	public Candidate(double tM,double tM1,double tM2,int id,String n,Date dob,Address add) {
		this.testMark=tM;
		this.testMark1=tM1;
		this.testMark2=tM2;
		this.codeID=id;
		this.name=n;
		this.dob=dob;
		this.add=add;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the codeID:");
		this.setCodeID(kb.nextInt());
		kb.nextLine();
		System.out.println("What you name:");
		this.setName(kb.nextLine());
		System.out.println("The testMark:");
		this.setTestMark(kb.nextDouble());
		System.out.println("The testMark1:");
		this.setTestMark1(kb.nextDouble());
		System.out.println("The testMark2:");
		this.setTestMark2(kb.nextDouble());
		System.out.println("Enter date of brith:");
		dob.input();
		System.out.println("Enter Address:");
		add.input();
	}
	public void output() {
		System.out.println(this.codeID);
		System.out.println(this.name);
		System.out.println(this.testMark);
		System.out.println(this.testMark1);
		System.out.println(this.testMark2);
		System.out.println(this.dob);
		dob.output();
		System.out.println(this.add);
		add.output();
	}
	public double average() {
		return ((testMark1+testMark2)/2)+(testMark)/3;
	}
	public void average1() {
		if(this.average()>8)
			System.out.println("Good");
		else if(this.average()>7)
				System.out.println("Fairly good");
		else if(this.average()>5)
				System.out.println("Average");
		else System.out.println("Fail");
	}


	public static void main(String[] args) {
		Candidate sv=new Candidate();
		sv.input();
		sv.output();
		Date dob=new Date();
		Address add=new Address();
		sv.average1();
	}

}
