package point;
import java.util.Scanner;
public class ArrayOfPoints {
	
	private  Point []a = new Point[100]; 
	private int n;
	
	public int getN() {
		return n;
	}
	
	public void setN(int nn) {
		this.n=nn;
	}
	
	public ArrayOfPoints() {
		
	}
	
	public ArrayOfPoints(int nn) {
		this.setN(nn);
	}
	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter N: ");
		this.setN(kb.nextInt());
		for(int i=0 ;i<this.n;i++) {
			System.out.println("Enter Element " + i+": ");
			Point p = new Point();
			p.input();
			a[i]=p;
		}
	}
	public void output() {
		for(int i=0; i<this.n;i++) {
			System.out.print("Point "+(i+1)+" ");
			a[i].output();
		}
		System.out.println();		
	}
	public void distance() {
		double maxDistance=a[0].distence(a[1]);
		for(int i=1;i<this.n-1;i++) {
			for (int j=i+1;j<this.n;j++) {
				if(maxDistance<a[i].distence( a[j] )) {
					maxDistance = a[i].distence( a[j]);
				}
			}
		}
		System.out.println("Max Of Distance : "+maxDistance);
	}
	public void perimeter() {
		double maxPerimeter=0;
		for(int i=0;i<this.n-2;i++) {
			for (int j=i+1;j<this.n-1;j++) {
				for(int k=j+1;k<this.n;k++) {
					if(maxPerimeter <a[i].perimeter(a[j],a[k]))
						maxPerimeter =a[i].perimeter(a[j],a[k]);
				}
			}
		}
		System.out.println("Max Of Perimeter: " + maxPerimeter);
	} 
	public static void main(String[] args) {
		ArrayOfPoints p = new ArrayOfPoints();
		p.input();
		p.output();
		p.distance();
		p.perimeter();
	}

}