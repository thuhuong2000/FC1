package nextday1;

//import nextday.NextDay;

public class NextDay1 
{
private int day, month, year;
	
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	public void setDay(int d)
	{
		if(d<0 || d> numberOfDate() )
			day=1;
		else day=d;
			
	}
	public void setMonth(int m) 
	{
		if(m<=0 || m>12)month=1;
		else month=m;
	}
	public void setYear(int y)
	{
		if(y<0 || y>5000)year=2000;
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
	public void nextDay()
	{
		/*if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 ) 
		{
			if(day<31)
			{
				System.out.print(day+1);
				System.out.print("/"+ month);
				System.out.println("/"+ year);
				
			}
			else 
			{
				System.out.print(day=1);
				System.out.print("/"+ (month+1));
				System.out.println("/"+ year);
			}
		}
		else if(month==4 || month==6 || month==9 || month==11) 
			{
				if(day<30)
				{
					System.out.print(day+1);
					System.out.print("/"+ month);
					System.out.println("/"+ year);
				}
				else
				{
					System.out.print("/"+ (day=1));
					System.out.print("/"+ (month+1));
					System.out.println("/"+ year);
				}
			}
		else if(month==2)
			{
				if((year%4==0 && (year %100!=0) || (year%400==0)) && day<29)
					{
					System.out.print(day+1);
					System.out.print("/"+ month);
					System.out.println("/"+ year);
					}
				else 
					if(year%4==0 && (year %100!=0) || (year%400==0))
					{
						System.out.print(day=1);
						System.out.print("/"+ (month+1));
						System.out.println("/"+ year);
					}
					else if(day<28)
						{
							System.out.print(day+1);
							System.out.print("/"+ month);
							System.out.println("/"+ year);
						}
						else 
						{
							System.out.print(day=1);
							System.out.print("/"+ (month+1));
							System.out.println("/"+ year);
						}
			}
		else if(day<31)
			{
				System.out.print(day+1);
				System.out.print("/"+ month);
				System.out.println("/"+ year);
			}
			else 
			{
				System.out.print(day=1);
				System.out.print("/"+ (month=1));
				System.out.println("/"+ (year+1));
			}*/
		if(day==numberOfDate() )
			if(day==12) System.out.println("1/1" + (++year));
			else System.out.println("1/" + (++month) + "/" + year);
		else System.out.println((++day) + "/" + month + "/" +year);
	}

	public static void main(String[] args) 
	{
		NextDay1 d1=new NextDay1();
		d1.setYear (2000);
		d1.setMonth (1);
		d1.setDay (29);
		d1.nextDay();
		
		NextDay1 d2=new NextDay1();
		d2.setYear (2019);
		d2.setMonth (12);
		d2.setDay (31);
		d2.nextDay();
		
		NextDay1 d3=new NextDay1();
		d3.setYear (2016);
		d3.setMonth (2);
		d3.setDay (28);
		d3.nextDay();
	}

}
