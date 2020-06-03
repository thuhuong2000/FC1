package test;

public class B extends A
{
	//cung 1 package
	//B ke thua tu A
	//can access default, protected, public
	//can not access private members
	
	public void display1() {
		System.out.println(x);
		System.out.println(pvt);//error
		System.out.println(pro);
		System.out.println(pb);
	}

	public static void main(String[] args) {

	}
}
