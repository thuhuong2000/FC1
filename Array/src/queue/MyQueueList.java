package queue;

public class MyQueueList<E> {

	//Dinh nghia lop Node ben trong lop MyQueueList
	private static class Node<T> {
		//Khai bao thuoc tinh cua Node gom info va next
		private T info;
		private Node<T> next;
		public Node(T i, Node<T> n) {
			info = i;
			next = n;
		}
	}
	private Node<E> head;
	private Node<E> tail;
	private int size;
	//Ham khoi tao 
	public MyQueueList() {
		head = tail = null;
		size = 0;
	}
	public boolean add(E e) {
		Node<E> temp = new Node<E>(e, null);
		if (tail == null)
			head = temp;
		else {
			tail.next = temp;
			tail = temp;
			size++;
		}
		return true;
	}
	public boolean offer(E e){
		return add(e);
	}
	public E remove(){
		if(size<=0){
			System.out.println("Queue is full");
			System.exit(0);
		}
		E temp=head.info;
		head=head.next;
		size--;
		return temp;
	}
	public E poll(){
		if(size<=0) return null;
		else {
			E temp=head.info;
			head=head.next;
			size--;
			return temp;
		}
	}
	public E element() {
		if (size <= 0){
			System.out.println("Queue is empty");
			System.exit(0);
		}
		return head.info;
	}
	public E peek() {
		if (size <= 0)
			return null;
		return head.info;
	}
	public boolean isEmpty() {
		return (size <= 0);
	}

	public static void main(String[] args) {
		MyQueueArray<Integer> arr=new MyQueueArray<Integer>();
		
	}
}
