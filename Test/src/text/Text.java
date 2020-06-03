package text;

import java.util.Scanner;

public class Text {

	public static void main(String[] args)
{
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter something:");
		
		int a=kb.nextInt();
		double b=kb.nextDouble();
		String word =kb.next();
		String sentence=kb.nextLine();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(word);
		System.out.println(sentence);
		
		System.out.println("Enter x:");
		int x=kb.nextInt();
		
		System.out.println("Enter y:");
		double y=kb.nextDouble();
		
		System.out.println("Enter word:");
		String word1=kb.next();
		
		kb.nextLine();//xu li phim enter sau 1 so hoac 1 tu
		System.out.println("Enter sentence:");
		String sentence1=kb.nextLine();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(word1);
		System.out.println(sentence1);
		
	}

}
