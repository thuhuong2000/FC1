package date;

public class Date 
{
	private int month, year;
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMonth(int m) {
		if(m<=0 || m>12)month=1;
		else month=m;
	}
	
	public void setYear(int y) {
		if(y<=0 || y>5000)year=1900;
		else year=y;
	}
	public int numberOfDate() 
	{
		if( month== 1 || month==3 || month==5|| month == 7 || month == 8 || month== 10  || month== 12)
			return 31;
		else if (month == 4 || month == 6 || month ==9 || month ==11)
			return 30;
		else 
			{
			if ((year%4==0 && year %100!=0) || (year%400==0))
				return 29;
			else return 28;
			}
	}

	public static void main(String[] args) 
	{
		Date d1=new Date();
		d1.setMonth (2);
		d1.setYear (2000);
		System.out.println(d1.numberOfDate() );
		
		Date d2=new Date();
		d2.setMonth (12);
		d2.setYear (3125);
		System.out.println(d2.numberOfDate() );
		
		Date d3=new Date();
		d3.setMonth (2);
		d3.setYear (1300);
		System.out.println(d3.numberOfDate() );
	}

}
