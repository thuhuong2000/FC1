package project;
//Name: Employee
//Copyright: 2020
//Author: Thu Huong
//Date: 02/06/20
//Description: refactoring Employee
public class Employee {
	 public static final int money = 1400000;
	 String name;
	 double bonus;
	 double payRate;
	 
	 public double basicSalary(){
	  return payRate*money;
	 }
	 public double salary(){
	  return bonus + basicSalary();
	 }
	}	

