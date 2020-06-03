package circle;

public class Circle 
{
	//khai bao bien
	private double radier;
	
	//goi ham khoi tao khong doi so
	public  Circle() {
		radier=1;
	}
	
	//goi ham khoi tao co doi so
	public  Circle(double r) {
		setRadier(r);
	}
	
	public double getRadier() {
		return radier;
	}
	
	public void setRadier(double r) {
		if(r<0)radier = 0;
		else
			radier = r;
	}
	
	//cai dat phuong thuc
	public double area()
	{
		return 3.14*radier*radier;
	}
	
	public double perimeter()
	{
		return 2*3.14*radier;
	}
	
	public static void main(String[] args) 
	{
		//tao cac doi tuong co gia tri cu the rieng biet
		Circle a1= new Circle();//goi ham khoi tao khong doi so
		a1.setRadier (2);
		System.out.println( a1.area() );
		System.out.println( a1.perimeter() );
		
		Circle a2= new Circle();
		a2.setRadier (4);
		System.out.println( a2.area() );
		System.out.println( a2.perimeter() );
		
		Circle a3= new Circle(3);//goi ham khoi tao co doi so
		//a2.setRadier (4);
		System.out.println( a3.area() );
		System.out.println( a3.perimeter() );
	}
}
