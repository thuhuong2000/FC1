package linearequation;

public class Linearequation 
{
	//khai bao bien
	private double b, c;
	
	//goi ham khoi tao khong doi so
	public   Linearequation()
	{
		b=4;
		c=2;
	}
	
	//goi ham khoi tao co doi so
	public   Linearequation(double a1, double a2) 
	{
		setB(a1);
		setC(a2);
	}
	
	public double GetB() {
		return b;
	}
	
	public double GetC() {
		return c;
	}
	
	public void setB(double b1) { }
	
	public void setC(double c1) { }
	
	//cai dat phuong thuc
	public void solve()
	{
		if(b == 0) 
			if(c==0)
				System.out.println("Unlimited roots");
			else
				System.out.println("no root");
		else
			System.out.println(" x = "+ (-c/b));			
	}

	public static void main(String[] args) 
	{
		//tao ra cac doi tuong co gai tri rieng biet
		Linearequation p1=new Linearequation();//goi ham khoi tao khong doi so
		p1.solve();
		
		Linearequation p2=new Linearequation();
		p2.b= 0;
		p2.c= 2;
		p2.solve();
		
		Linearequation p3=new Linearequation(1,5);//goi ham khoi tao co doi so
		p3.solve();

	}

}
