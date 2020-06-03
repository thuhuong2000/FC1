package file;
import java.util.Scanner;
public class File {

	public static void main(String[] args) 
	{
		/*
		int slint=0;
		double sDouble=0;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter String s:");
		String s=kb.nextLine();
		System.out.println(s);
		
		Scanner kb1=new Scanner(s);
		while(kb1.hasNext()==true) {
			if(kb1.hasNextInt()==true)
				slint=slint+kb1.nextInt();
			else
				if(kb1.hasNextDouble()==true)
					sDouble+=kb1.nextDouble();
				else kb1.next();
		}
		System.out.println(slint);
		System.out.println(sDouble);
	}*/
		
		//dao ten
		Scanner kb=new Scanner("Le Thi Thu Huong");
		String sNew="";
		while(kb.hasNext()==true) {
			sNew=kb.next()+" "+sNew;
		}
		System.out.println(sNew);
		
		//cat ten
		String str ="Le Thi Thu Huong";
		int index=str.lastIndexOf(" ");
		System.out.println(index);
		
		String lastname = str.substring(index+1);
		String fullname = str.substring(0, index);
		System.out.println(lastname);
		System.out.println(fullname);
		
		
	}
}
