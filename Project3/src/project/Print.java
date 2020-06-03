package project;
//Name: Print
//Copyright: 2020
//Author: Thu Huong
//Date: 02/06/20
//Description: refactoring print *...
public class Print {
	 public void printStart(String str) {
	  System.out.println("*****************");
	  System.out.println("******"+str+"******");
	  System.out.println("*****************");
	 }
	 public static void main(String[] args) {
		 Print a = new Print();
		 a.printStart("START");
		 a.printStart("*END*");
	 }
}