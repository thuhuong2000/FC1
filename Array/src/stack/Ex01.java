package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ex01 
{
	private int n;
	public void setN(int n) {
		this.n=n;
	}

	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.print("Nhap n:");
		this.setN(kb.nextInt());
	}
	public void dnible(int k) {
		Stack<Integer> s=new Stack<Integer>();
		int du;
		while(n>0) {
			du=n%k;
			s.push(du);
			n=n/k;
		}
		while(s.empty()==false)
			if(s.peek()<10)
				System.out.print(s.pop() );
			else {
					System.out.print((char) (s.pop()+55));
				}
	}
	public boolean doiXung() {
		Stack<Integer> s=new Stack<Integer>();
		Queue q=new LinkedList<Integer>();
		int du;
		while(n>0) {
			du=n%10;
			s.push(du);
			n=n/10;
		}
		while(s.empty()==false && q.isEmpty()==false)
			if(s.pop()!=q.remove())
				return false;
		return true;
			
	}

	public static void main(String[] args) {
		Ex01 ex=new Ex01();
		ex.input();
		ex.dnible(16);
		System.out.println("\n"+ex.doiXung());

	}

}
