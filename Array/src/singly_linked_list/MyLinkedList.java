package singly_linked_list;

import java.util.LinkedList;

public class MyLinkedList <E>
{
	//.................................
	//Dinh nghia lop Node ben trong lop SinglyLinkedList
	private class Node{
		//Khai bao thuoc tinh cua Node gom info , next
		private E info;
		private Node next;
		//ham khoi tao khong doi so
		public Node(E info) {
			this.info=info;
			this.next=null;
		}
		//Ham khoi tao co doi so
		public Node(E info,Node next) {
			this.info=info;
			this.next=next;
		}
	}
	//..................................
	//Khai bao thuoc tinh cua lop Singly LinkedList
	private Node head,tail;
	private int size;
	//Ham khoi tao khong doi so
	public MyLinkedList() {
		head=tail=null;
		size=0;
	}
	//Them element vao cuoi LinkedList head
	public void addLast(E element) {
		Node p=new Node(element);
		//Danh sach rong
		if(head==null)
			head=tail=p;
		else //danh sach khac rong
		{
			tail.next=p;
			tail=p;
		}
		size++;
	}
	@Override
	public String toString() {
		String s=" ";
		Node q=head;
		while(q!=null) {
			s=s + q.info + " ";
			q=q.next;
		}
		return s;
	}
	
	//Tinh tong cac gia tri trong LinkedList
	public int sum() {
		int s=0;
		Node q=head;
		while(q!=null)
		{	
			s=s +(Integer)q.info;
			q=q.next;
		}
		return s;
	}

	//Dem trong LinkedList co bao nhieu gia tri chan
	public int coutEven()
	{
		int k=0;
		Node q= head;
		while(q!=null) {
			if((Integer)q.info%2==0) 
				k++; 
				q=q.next;
		}
		return k;
	} 
	
	//ktra nguyen to
	public boolean isPrime(int x) {
		if(x<2)
			return false;
		for(int i=2;i<=Math.sqrt(x);i++)
			if(x%i==0) return false;
				return true;
	}
	
	//Tinh trung binh cong cac so nguyen to trong LinkedList
	public double averagePrime() {
		double s=0; int d=0;
		Node q=head;
		while (q!=null)
		{
			if((isPrime ((Integer)q.info))) {
				s=s+(Integer) q.info;
					d++;
			}
			q=q.next;
		}
		return (s/d);		
	}
	
	//in ra gia tri cua node cuoi
	public E number() {
		Node q=head;
		while(q.next!=null) {
			q=q.next;
		}
		return q.info;
	}
	
	//in ra cac gia tri cua node ke cuoi
	public E lastNumber() {
		Node q= head;
		while((q.next.next)!=null)
		{
			q=q.next;
		}
		return q.info;
	}
	
	//dao 2 node dau danh sach cho nhau
	public void reverse1() {
		Node q=head.next;
		if(size>2) 
		{
			head.next=q.next;	//1
			q.next=head;		//2
		}
		if(size==2) 
			tail=head;
		head=q;			//3
	}
	
	//dao 2 node cuoi danh sach cho nhau
	public void reverse2() {
		if(size==2) reverse1();
		if(size>2) 
		{
			//xac dinh q
			Node q=head;
			while(q.next!=tail)
				q=q.next;
			//xac dinh r
			Node r=head;
			while(r.next!=q)
				r=r.next;
			//Dao
			r.next=q.next;
			tail.next=q;
			q.next=null;
			tail=q;
		}
	}
	
	//dao nguoc node dau va node cuoi danh sach
	public void reverse3() {
		if(size==2) reverse1();
		if(size>2) 
		{
			//xac dinh q
			Node q=head;
			while(q.next!=tail)
				q=q.next;
			//xac dinh r
			Node r=head.next;
			q.next=head;
			head.next=null;
			tail.next=r;
			head=tail;
			tail=q.next;
		}
	}
	
	//dao nguoc toan bo danh sach
	public void reverse4() 
	{
		Node head1 =null;
		Node q = head;
		while(q!= null)
		{
			head = head.next;
			q.next = head1;
			head1=q;
			q=head;
		}
		head = head1;
	}
	
	//Kiem tra e co trong danh sach
	public boolean containt(E element){
		Node q=head;
		while(q!=null){
		if(q.info==element)
				return true;
		q=q.next;
		}
		return false;
	}
	//xoa cac so nguyen am ra khoi danh sach
	public void deleteNegative(){
		while((Integer)head.info < 0){
			head = head .next;
			this.size--;
		}
		while((Integer)tail.info < 0){
			Node r = head;
			while(r.next != tail){
				r = r.next;
			}
			r.next = null;
			tail = r;
			this.size--;
		}
		Node q = head.next;
		Node r = head;
		while(q!=null){
			if((Integer)q.info<0){
				q = q.next;
				this.size--;
			}
			else{
				r.next = q;
				r = q;
				q = q.next;
			}
		}
		tail = r;
	}
	//xoa node dau danh sach
	public void removeFirst(){
		if(size ==0)
			System.out.println("Linkedlist is empty");
		else{
				if(size ==1)
					head = tail = null;
				else{
					Node q = head.next;
					head.next = null;
					head = q;
				}
				size--;
		}
	}
	//xoa node cuoi danh sach
	public void removeLast(){
		if(size ==0)
			System.out.println("Linkedlist is empty");
		else{
				if(size ==1)
					head = tail = null;
				else{
					Node q =head;
					while(q.next !=tail)
						q = q.next;
					q.next = null;
					tail = q;
				}
				size--;
		}
	}
	//them Node vao dau trong danh sach
	public void addFirst(E element){
		Node p = new Node(element);
		if(size ==0)
			head=tail = p;
		else{
			p.next =head;
			head = p;
		}
		size++;
	}
	//ham Get
	public E get(int index) {
		if(index<0||index>=size) {
			System.out.println("Invalid index");
			return null;
		}
		else {
			int i=0;
			Node q=head;
			while(i<index) {
				q=q.next;
				i++;
			}
			return q.info;
		}
	}
	//ham Set
	public void set(int index,E e) {
		if(index<0||index>size)
			System.out.println("Invalid index");
		else {
			Node q=head;
			for(int i=0;i<index;i++)
				q=q.next;
			q.info=e;
		}
	}
	//Them node vao vi tri index
	public void addIndex(int index,E e) {
		if(index<0||index>size)
			System.out.println("Invalid index");
		else
			if(index==0) addFirst(e);
			else
				if(index==size) addLast(e);
				else {
					//Xac dinh q
					Node q=head;
					for(int i=0;i<index;i++)
						q=q.next;
					//Xac dinh r
					Node r=head;
					while(r.next!=q)
						r=r.next;
					Node p=new Node(e);
					//Noi
					r.next=p;
					p.next=q;
					size++;
				}
		
	}
	//Xoa Node tai vi tri index trong danh sach
	public void removeIndex(int index) {
		if(index<0||index>=size)
			System.out.println("Invalid index");
		else
			if(index==0) removeFirst();
			else
				if(index==size-1) removeLast();
				else {
					//xac dinh q
					Node q=head;
					for(int i=0;i<index;i++)
						q=q.next;
					//Xac dinh r
					Node r=head;
					while(r.next!=q)
						r=r.next;
					q.next=null;
					r.next=q;
					size--;
				}
	}
	public static void main(String[] args) {
		MyLinkedList<Integer> list=new MyLinkedList<Integer>();
		list.addLast(-8);
		list.addLast(1);
		list.addLast(9);
		list.addLast(-2);
		list.addLast(5);
		list.addLast(7);
		list.addLast(-6);
		System.out.println(list.toString());
		/*System.out.println("Tong:"+list.sum());
		System.out.println("So chan gom:"+list.coutEven());
		System.out.println("Trung binh cong so nguyen to:"+list.averagePrime());
		System.out.println("Gia tri nut cuoi:"+list.number());
		System.out.println("Gia tri nut ke cuoi:"+list.lastNumber());
		
		list.reverse1();
		System.out.println(list.toString());
		list.reverse2();
		System.out.println(list.toString());
		list.reverse3();
		System.out.println(list.toString());
		list.reverse4();
		System.out.println(list.toString());
		
		list.deleteNegative();
		System.out.println(list.toString());
		list.removeFirst();
		System.out.println(list.toString());
		list.removeLast();
		System.out.println(list.toString());
		list.addFirst(101);
		System.out.println(list.toString());
		
		System.out.println(list.get(4));
		list.set(4, 101);
		System.out.println(list.toString());
		list.addIndex(2,99);
		System.out.println(list.toString());
		*/
		list.removeIndex(1);
		System.out.println(list.toString());

	}

}
