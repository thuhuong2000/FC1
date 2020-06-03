package stack;

public class MyStackLinkedList<E>
{
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
	private Node top;
	private int size;
	
	//khoi tao stack rong
	public MyStackLinkedList() {
		top=null;
		size=0;
	}
	//Stack co rong hay khong
	public boolean empty() {
		if(top==null)
			return true;
		else return false;
	}
	//Day e vao dinh Satck
	public E push(E e) {
		Node p=new Node(e);
		if(top==null)
			top=p;
		else {
			p.next=top;
			top=p;
		}
		size ++;
		return e;
	}
	//Tra ve e nam o dinh Stack
	public E peeck() {
		if(top==null) {
			System.out.println("Stack is empty");
			return null;
		}
		else return top.info;
	}
	//Tra ve e nam o dinh Stack va loai bo e
	public E pop() {
		if(top==null) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
			E tmp=top.info;
			top=top.next;
			size--;
			return tmp;
		}
	}
	@Override
	public String toString() {
		String s=" ";
		Node q=top;
		while(q!=null) {
			s=q.info +" "+ s ;
			q=q.next;
		}
		return s;
	}
	//Tra ve vi tri cua phan tu e(1) (-1) neu k co
	public int search(E e) {
		int s=1;
		Node q=top;//khai bao node q
		while(q!=null) {
			if(e.equals(q.info)) return s;
			else {
				q=q.next;
				s++;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		MyStackLinkedList<Integer> sta=new MyStackLinkedList<Integer>();
		sta.push(2);
		sta.push(8);
		sta.push(3);
		sta.push(10);
		sta.push(7);
		System.out.println(sta.toString());
		System.out.println(sta.search(8));
		

	}

}
