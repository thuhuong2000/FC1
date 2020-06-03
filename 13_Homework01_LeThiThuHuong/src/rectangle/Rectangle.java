package rectangle;

public class Rectangle 
{
	//khai bao thuoc tinh
	private double length, width;
	
	//contruction: ham khoi tao khong doi so
		//gan gia tri mac dinh ban dau cho thuoc tinh cua class
	public    Rectangle() {
				
			}
		
	//contruction: ham khoi tao co doi so
	//truyen tham so ngoai vao cho thuoc tinh class
	public    Rectangle(double l,double w) {
		setLength(l);
		setWidth(w);
		}
		
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setLength(double l) {
		if(l<0)length = 0;
		else
			length = l;
	}
	
	public void setWidth(double w) {
		if(w<0)width = 0;
		else
			width = w;
	}
	//cai dat phuong thuc
	
	public double area()
	{
		return length*width;
	}
	
	public double perimeter()
	{
		return (length + width)*2;
	}
	
	public static void main(String[] args) 
	{
		//tao cac doi tuong rieng co gia tri cu the rieng
		Rectangle r1 = new Rectangle();//goi ham khoi tao khong doi so
		r1.setLength (2);
		r1.setWidth (8);
		System.out.println( r1.area() );
		System.out.println( r1.perimeter() );
		
		Rectangle r3 = new Rectangle(3,4);//goi ham khoi tao co doi so
		System.out.println( r3.area() );
		System.out.println( r3.perimeter() );
		
		/*Rectangle r2 = new Rectangle();
		r2.setLength (5);
		r2.setWidth (7);
		System.out.println( r2.area() );
		System.out.println( r2.perimeter() );*/
	}

}
