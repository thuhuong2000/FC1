package exception_handling;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionDemo {

	public static void main(String[] args) {
		/*
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter an intoger:");
		int number = Scanner.nextInt();
		//Display the result
		System.out.println("The number entered is" + number);
		*/
		
		Scanner Scanner=new Scanner(System.in);
		boolean continueInput=true;
		do {
			try {
				System.out.println("Enter an intoger:");
				int number = Scanner.nextInt();
				//Display the result
				System.out.println("The number entered is" + number);
				continueInput = false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Try again ("+"ffghg");
				Scanner.nextLine();
			}
		}while(continueInput);
		
	}

}
