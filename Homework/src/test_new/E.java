package test_new;
import test.A;
public class E 
{
	//khong cung 1 package
	//khong ke thua
	//can access public member
	//can not access default, private, protected members

	public void display2() {
		A a=new A();
		System.out.println(a.x);//error
		System.out.println(a.pvt);//error
		System.out.println(a.pro);//error
		System.out.println(a.pb);
	}
	public static void main(String[] args) {

	}
}
