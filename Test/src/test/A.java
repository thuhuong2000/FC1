package test;

public class A 
{
	int x=1;//access modifier default
	private int pvt=2;
	protected int pro=3;
	public int pb=4;
	
	//methods here can access all variables
	
	public void display() {
		System.out.println(x);
		System.out.println(pvt);
		System.out.println(pro);
		System.out.println(pb);
	}

	public static void main(String[] args) {

	}
}
