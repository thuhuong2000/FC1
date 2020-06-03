package date;
public class Date {
	//khai bao thuoc tinh
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
	
	//cai dat cac thuoc tinh
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
	public void nextDay() {
		if(day<numberOfDate())
			day=day+1;
		else {
			day=1;
			if(month==12) {
				month=1;
				year=year+1;
			}
			else {
				month=month+1;
			}
		}
		System.out.println("Day:"+ day);
		System.out.println("Month:"+ month);
		System.out.println("Year:"+ year);
	}
	public static void main(String[] args) {
		//cac doi tuong rieng biet
		Date y1=new Date();
		System.out.println("L1:");
			y1.setYear(2016);
			y1.setMonth(1);
			y1.setDay(31);
			y1.nextDay();
		Date y2=new Date();
		System.out.println("L2:");
			y2.setYear(2017);
			y2.setMonth(2);
			y2.setDay(29);
			y2.nextDay();
		Date y3=new Date();
		System.out.println("L3:");
			y3.setYear(2016);
			y3.setMonth(12);
			y3.setDay(30);
			y3.nextDay();
	}
}