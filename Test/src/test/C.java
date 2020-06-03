package test;

public class C 
{
	//cung 1 package
	//can access default, protected, publics
	//can not access private members
	
	public void display2() {
		A a=new A();
		System.out.println(a.x);
		System.out.println(a.pvt);//error
		System.out.println(a.pro);
		System.out.println(a.pb);
	}

	public static void main(String[] args) {

	}
}
