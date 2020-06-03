package candidate;
import java.util.Scanner;

import fraction.Fraction;
public class ArrayOfCandidate {
	private int n;
	private Candidate []a=new Candidate[100];
	public int getN() {
		return n;
	}
	public void setN(int nn) {
		if(nn<0) n=0;
		else this.n=nn;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter n:");
		n=kb.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter element"+ i + ":");
			//khoi tao va nhap Candidate
			Candidate c=new Candidate();
			c.input();
			a[i]=c;
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			a[i].output();
		}
		System.out.println();
	}
	public int number() {
		int d=n;
		for(int i=0;i<n;i++) {
			if(a[i].average()<5) {
				d--;
			}
		}
		return d;
	}
	public void studentPass() {
		for(int i=0;i<n;i++) {
			if(a[i].average()>5)
				a[i].output();
		}
	}
	public void remove(int index) {
		for(int i=index;i<this.n-1;i++) {
			a[i]=a[i+1];
		}
		n--;
	}
	public void month8() {
		for(int i=0;i<n;i++) {
			if((a[i].getDate()).getMonth()==8) {
				a[i].output();
			}
		}
		System.out.println();
	}
	
	public void remove2000() {
		for(int i=0;i<n;i++) {
			if((a[i].getDate()).getYear()==2000) {
				remove(i);
				i--;
			}
		}
		System.out.println();
	}
	public void streetNVL() {
		for(int i=0;i<n;i++) {
			if((a[i].getAddress()).getStreet()==("Nguyen Van Linh"))
				a[i].output();
		}
	}
	public void districtHC() {
		for(int i=0;i<n;i++) {
			if((a[i].getAddress()).getDistrict()==("Hai Chau"))
				a[i].output();
		}
	}
	public void sort() {
		for(int i=0;i<this.n-1;i++) {
			for(int j=i+1;j<this.n;j++) {
				if((a[i].getDate()).getYear()>(a[j].getDate()).getYear()){
						Candidate T=a[i];
						a[i]=a[j];
						a[j]=T;
				}
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayOfCandidate arr=new ArrayOfCandidate();
		arr.input();
		arr.output();
		System.out.println("The number students pass is:"+ arr.number());
		System.out.println("The students pass is:");
		arr.studentPass();
		System.out.println("Student with brithday in August:");
		arr.month8();
		System.out.println("Students who were not born in 2000:");
		arr.remove2000();
		arr.output();
		System.out.println("Students on the street Nguyen Van Linh:");
		arr.streetNVL();
		arr.output();
		System.out.println("Students on the distric Hai Chau:");
		arr.districtHC();
		arr.output();
		System.out.println("The sort by age decreases:");
		arr.sort();
		arr.output();
		//equalsIgnoreCase
	}

}
