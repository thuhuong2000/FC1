package person;

import java.util.Scanner;
public class Date 
{
		private int day,month, year;
		public int getDay() {
			return day;
		}
		
		public int getMonth() {
			return month;
		}
		
		public int getYear() {
			return year;
		}
		
		public void setDay(int d) {
			if(d<1 || d>numberOfDate()) 
				day=1;
			else 
				day=d;
		}
		public void setMonth(int m) {
			if(m<1 || m>12)
				month=1;
			else
				month=m;
		}
		public void setYear(int y) {
			if(y<1900)
				year=1900;
			else
				year=y;
		}
		public Date() {
			day=1;
			month=1;
			year=1900;
		}
		public Date(int d, int m, int y) {
			setYear(y);
			setMonth(m);
			setDay(d);
		}
		public int numberOfDate() {
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				return 31;
			}
			else {
				if(month==4||month==6||month==11||month==9) {
					return 30;
				}
				else {
					if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
						return 29;
					}
					else 
						return 28;
				}
			}
		}
		public void input() {
			Scanner kb=new Scanner(System.in);
			int d;
			do {
				System.out.println("Enter day:");
				d=kb.nextInt();
			}while(d>numberOfDate());
			setDay(d);
			int m;
			do {
				System.out.println("Enter month:");
				m=kb.nextInt();
			}while(m>12);
			setMonth(m);
			int y;
			do {
				System.out.println("Enter year:");
				y=kb.nextInt();
			}while(y>5000);
			setYear(y);
		}
		public void output() {
			System.out.println(this.day+"/"+this.month+"/"+this.year);
		}

	public static void main(String[] args) 
	{
		Date b=new Date();
		b.input();
		b.output();

	}

}
