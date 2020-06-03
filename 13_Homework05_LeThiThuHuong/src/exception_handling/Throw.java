package exception_handling;
import java.io.IOException;
import java.util.Scanner;

public class Throw {
	/*
	static void validate(int age) {
		if(age<18) throw new ArithmeticException("not vaild");
		else System.out.println("welcome to vote");
	}

	public static void main(String[] args) {
		validate(13);
		System.out.println("rest of the code....");

	}
	 */
	
	public static void divide()throws IOException {
		int a=50,b;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the value of b:");
		if(kb.hasNextInt()) throw new IOException("not vaild");
		else {
			b=kb.nextInt();
			a=a/b;
			System.out.println(a+b);
		}
		System.out.println("Finsh");
	}

	public static void main(String[] args)throws IOException {
		divide();

	}
}
