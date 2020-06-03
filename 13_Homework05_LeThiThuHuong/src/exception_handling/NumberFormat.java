package exception_handling;
import java.util.Scanner;
public class NumberFormat {
	public static void format() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the string s:");
		String s=kb.nextLine();
		int a=Integer.parseInt(s);
		System.out.println(a);
	}

	public static void main(String[] args) {
		format();
	}

}
