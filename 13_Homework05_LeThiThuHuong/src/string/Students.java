package string;

public class Students {
	private int rollno;
	private String name;
	private String city;
	
	public Students(int rollno,String name,String city) {
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
	public String toString() {//overriding the toString() method
		return rollno+" "+name+" "+city;
	}

	public static void main(String[] args) {
		Student s1=new Student(101,"Join","NewYor");
		Student s2=new Student(102,"Kate","LoseAnger");
		System.out.println(s1);//compller writes here s1.toString()
		System.out.println(s2);//compller writes here s2.toString()
	}

}
