package stack;

import java.util.Scanner;
import java.util.Stack;

public class Expression {
	private String srt;
	public void input()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Enter string : ");
		srt = kb.next();
		kb.nextLine();
	}
	public boolean checkBracker()
	{
		Stack<String> s = new Stack<String>();
		for(int i = 0 ; i <  srt.length() ; i++)
		{
			if(srt.charAt(i) == '(')
				s.add(String.valueOf(srt.charAt(i)));
			else if(srt.charAt(i) == ')' && s.empty()) 
				return false;
			else s.pop();
		}
		if(s.empty())
			return true;
		return false;
	}
	public static void main(String[] args) {
		Expression e=new Expression();
		e.input();
		System.out.println(e.checkBracker());
	}
}
