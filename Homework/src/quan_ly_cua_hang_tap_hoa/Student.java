package quan_ly_cua_hang_tap_hoa;

public class Student {
	private String code;
	private String name;
	private double m1;
	private double m2;
	private double m3;
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getM1() {
		return m1;
	}

	public void setM1(double m1) {
		this.m1 = m1;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getM3() {
		return m3;
	}

	public void setM3(double m3) {
		this.m3 = m3;
	}
	public Student(){
		code="";
		name="";
		m1=0;
		m2=0;
		m3=0;
	}
	public String name(){
		int i=0;
		for (i=name.length()-1;i>=0;i--)
			if (name.charAt(i)==' ')
				break;
		return name.substring(i+1);
	}
	public String ho(){
		int i=0;
		for (;i<name.length();i++)
			if (name.charAt(i)==' ')
				break;
		return name.substring(0, i);
	}
	
	
	public String name1(String s){
		int i=0;
		for (i=s.length()-1;i>=0;i--)
			if (s.charAt(i)==' ')
				break;
		return s.substring(i+1);
	}
	public String ho1(String s){
		int i=0;
		for (;i<s.length();i++)
			if (s.charAt(i)==' ')
				break;
		return s.substring(0, i);
	}
	public static void main(String[] agrs){
		Student s= new Student();
		System.out.println(s.name());
		System.out.println(s.ho());
	}
}

