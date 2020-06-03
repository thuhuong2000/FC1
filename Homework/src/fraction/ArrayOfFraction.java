package fraction;
import java.util.Scanner;
public class ArrayOfFraction {
	private int n;
	private Fraction []a=new Fraction[100];
	public int getN() {
		return n;
	}
	public void setN(int nn) {
		if(nn<0) n=0;
		else n=nn;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter n:");
		n=kb.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter element"+ i + ":");
			//khoi tao va nhap Fraction
			Fraction f=new Fraction();
			f.input();
			a[i]=f;
		}
	}
	
	public void output() {
		for(int i=0;i<n;i++) {
			a[i].output();
		}
		System.out.println();
	}
	public void maxFraction() {
		int vt=0;
		double max=1.0*a[0].divisionA();
		for(int i=1;i<this.n;i++) {
			if(max<1.0*a[i].divisionA()) {
				max=1.0*a[i].divisionA();
				vt=i;
			}
		}
		a[vt].output();
	}
	public void sumMaxFraction1() {
		int vt=0;
		double sumMax=1.0*a[0].divisionA();
		for(int i=0;i<this.n-1;i++) {
			Fraction f3=a[i].plus(a[i+1]);
			if(sumMax<1.0*f3.divisionA()) {
				sumMax=1.0*f3.divisionA();
				vt=i;
			}
		}
		a[vt].output();
		System.out.print("+"+" ");
		a[vt+1].output();
		System.out.print("="+" ");
		a[vt].plus(a[vt+1]).output();
		System.out.println();
	}
	public void sumMaxfraction2() {
		int vt=0,vt1=1;
		double sumMax=1.0*a[0].divisionA();
		for(int i=0;i<this.n-1;i++) {
			for(int j=i+1;j<this.n;j++) {
				Fraction f3=a[i].plus(a[j]);
				if(sumMax<1.0*f3.divisionA()) {
					sumMax=1.0*f3.divisionA();
					vt=i;
					vt1=j;
				}
			}
		}
		a[vt].output();
		System.out.print("+"+" ");
		a[vt1].output();
		System.out.print("="+' ');
		a[vt].plus(a[vt1]).output();
		System.out.println();
	}
	public void sortFraction() {
		for(int i=0;i<this.n-1;i++) {
			for(int j=i+1;j<this.n;j++) {
				if(1.0*a[i].divisionA() > 1.0*a[j].divisionA()){
						Fraction T=a[i];
						a[i]=a[j];
						a[j]=T;
				}
			}
		}
		System.out.println();
	}
	public Fraction sum() {
		Fraction sum1=a[0];
		for(int i=1;i<this.n;i++) {
			sum1 = sum1.plus(a[i]);
		}
		return sum1;
	}
	public void remove(int index) {
		for(int i=index;i<this.n-1;i++) {
			a[i]=a[i+1];
		}
		n--;
		System.out.println();
	}
	public void insert(Fraction f,int index) {
		for(int i=this.n;i>index;i--) {
			a[i]=a[i-1];
		}
		a[index]=f;
		this.n++;
	}
	public void removeDenoEven() {
		for(int i=0;i<this.n;i++) {
			if(a[i].getDenominator()%2==0) {
				remove(i);
				i--;
			}
		}
		System.out.println();
	}
	public boolean testPrime(int x) {
		if(x == 1) return false;
		for(int i = 2 ; i <= x/2 ; i++)
			if(x % i == 0)
				return false;
		return true;
	}
	public void printNumeratorPrime() {
		System.out.println("\nPrint Numerator Prime:");
		int vt=0;
		for( int i=0;i<n;i++)
			if( testPrime(a[i].getNumerator())) {
				vt=i;
				a[vt].output();
			}
	}

	public static void main(String[] args) {
		ArrayOfFraction arr=new ArrayOfFraction();
		arr.input();
		arr.output();
		System.out.println("The max Fraction:");
		arr.maxFraction();
		
	}

}
