package test_new;
import test.A;
public class D extends A
{
	//khong cung 1 package
	//D ke thua tu A
	//can access protected, public member
	//can not access default, private members
	
	public void display3() {
		A a=new A();
		System.out.println(a.x);//error
		System.out.println(a.pvt);//error
		System.out.println(pro);
		System.out.println(a.pb);
	}

	public static void main(String[] args) {

	}
}
