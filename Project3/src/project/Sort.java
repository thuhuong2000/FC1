package project;
//Name: Sort
//Copyright: 2020
//Author: Thu Huong
//Date: 02/06/20
//Description: refactoring Sort
public class Sort {
	 int number1;
	 int number2;
	 int number3;
	 public void ascSort(){
		  sort(number1,number2);
		  sort(number1,number3); 
		  sort(number2,number3);
	 }
	private void sort(int a,int b ) {
		if(a>b)
		  {
		   int temp =a;
		   a = b;
		   b = temp;
		  }
	}
	}

