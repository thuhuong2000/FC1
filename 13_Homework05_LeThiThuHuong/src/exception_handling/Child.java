package exception_handling;
/*
import java.io.IOException;
public class Child extends Parent{
	void msg()throws IOException{
		System.out.println("child");
	}
	public static void main(String[] args) {
		Parent p=new Child();
		p.msg();
	}

}
*/
public class Child extends Parent{
	void msg()throws ArithmeticException{
		System.out.println("child");
	}
	public static void main(String[] args) {
		Parent p=new Child();
		p.msg();
	}

}
