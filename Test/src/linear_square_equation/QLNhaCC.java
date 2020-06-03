package linear_square_equation;

import java.util.Scanner;

public class QLNhaCC {
	private String nhacc;
	public String getNhacc() {
		return nhacc;
	}
	public void setNhacc(String nhacc) {
		this.nhacc=nhacc;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the name Nha Cung Cap:");
		this.setNhacc(kb.nextLine());
	}
	public void output() {
		System.out.println(this.nhacc);
	}

	public static void main(String[] args) {
		QLNhaCC nhacc=new QLNhaCC();
		nhacc.input();
		nhacc.output();

	}

}
