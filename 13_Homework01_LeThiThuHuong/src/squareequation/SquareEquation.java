package squareequation;

public class SquareEquation 
{
	//khai bao bien
	private double a, b, c;
		
	//goi ham khoi tao khong doi so
	public  SquareEquation() 
		{
		a=6;
		b=2;
		c=1;
		}
		
	//goi ham khoi tao co doi so
	public  SquareEquation(double d,double e,double f) 
		{
		setA(d);
		setB(e);
		setC(f);
			
		}
		
		public double getA() {
			return a;
		}
		
		public double GetB() {
			return b;
		}
		
		public double GetC() {
			return c;
		}
		
		public void setA(double a1) { }
		
		public void setB(double b1) { }
		
		public void setC(double c1) { }
	
	//cai dat phuong thuc
	public void slove()
	{
		if(a!=0 )
			if((b*b-4*a*c) < 0)
			System.out.println("Unlimited roots");
			else if((b*b-4*a*c) == 0)
			System.out.println(" x = "+ (-b/2*a));
				else 
				{
					System.out.println("x1 = "+ (-b+Math.sqrt(b*b-4*a*c))/2*a);
					System.out.println("x2 = "+ (-b-Math.sqrt(b*b-4*a*c))/2*a);
				}
		else
		{
			System.out.println("It is not SquareEquation");
		}
	}

	public static void main(String[] args) 
	{
		//tao ra cac doi tuong co gia tri rieng biet
		SquareEquation r1=new SquareEquation();
		r1.a= 1;
		r1.b= 4;
		r1.c= 3;
		r1.slove();
		
		SquareEquation r2=new SquareEquation();//goi ham khoi tao khong doi so
		r2.slove();
		
		SquareEquation r3=new SquareEquation(2,4,2);//goi ham khoi tao co doi so
		r3.slove();

	}

}
