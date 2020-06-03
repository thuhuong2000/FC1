package exception_handling;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Arithmetic {
	/*
	public static void divide() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the value of b:");
		int b=kb.nextInt();
		int a=50;
		a=a/b;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		divide();
	}
	*/
	
	/*
	public static void divide() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the value of b:");
		int b=kb.nextInt();
		int a=50;
		try {
		a=a/b;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		divide();
	}
	*/
	
	public static void divide() {
		int a=50,b;
		Scanner kb=new Scanner(System.in);
		try {
			System.out.println("Enter the value of b:");
			b=kb.nextInt();
			a=a/b;
			System.out.println(a+b);
		}catch(InputMismatchException e) {
			System.out.println("Error1:"+e);
		}catch(ArithmeticException e) {
			System.out.println("Error2:"+e);
		}
		System.out.println("Finish");
	}

	public static void main(String[] args) {
		divide();
	}
}
