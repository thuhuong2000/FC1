package project;
//Name: MaxNumber
//Copyright: 2020
//Author: Thu Huong
//Date: 02/06/20
//Description: refactoring class MaxNumber
public class MaxNumber {
	public int max2(int a, int b) {
		if (a >= b)
		   return a;
		  else
		   return b;
	}
	 public int max3(int a, int b, int c) {
	  if (a >= b)
		return max2(a, c);
	else
		return max2(b, c);
	 }
}

