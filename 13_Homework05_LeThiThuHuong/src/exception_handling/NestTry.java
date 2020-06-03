package exception_handling;
import java.util.Scanner;
public class NestTry {
	/*
	public static void main(String[] args) {
		try {
			int a=args.length;
			int b=50/a;
		}catch(Exception e) {
			System.out.println("General Exception catch");
		}
		/*This catch iis never reached because
		 AirthemeticException is a subclass of Exception/
		 
		catch(AirthemeticException e) {//ERROR - unreached
			System.out.println(e);
		}
	}
	*/
	
	public static void main(String[] args) {
		try {
			System.out.println("Enter a:");
			int a=new Scanner(System.in).nextInt();
			int b=50/a;
			System.out.println("a="+a);
			try {
				if(a==1) a=a/(a-a);
				if(a==2) {
					int []c=new int[3];
					c[3]=2;
				}
			}catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Boounds Exception");
			}
		}catch(Exception e) {
			System.out.println("e");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
