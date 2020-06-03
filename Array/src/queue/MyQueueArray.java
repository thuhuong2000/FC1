package queue;

public class MyQueueArray<E> {

	//Queue la inteface k the new chi new lop con
	
	private E[] a;
	private int head;
	private int tail;
	private int size;
	//khoi tao khong doi so
	public MyQueueArray() {
		a = (E[]) new Object[10];
		head = 0;
		tail = 0;
		size = 0;
	}
	//khoi tao co doi so
	public MyQueueArray(int size) {
		a = (E[]) new Object[size];
		head = 0;
		tail = 0;
		size = 0;
	}
	
	public E add(E e) {
		if (size >= a.length) {
			System.out.println("Queue is full");
			return null;
		}
		else {
			a[tail++] = e;
			tail = tail % a.length;
			size++;
		}
		return e;
	}
	
	public boolean offer(E e) {
		if (size >= a.length)
			return false;
		a[tail++] = e;
		tail = tail % a.length;
		size++;
		return true;
	}
	
	public E remove() {
		if (size <= 0) {
			System.out.println("Queue is empty");
			return null;
		}
		else {
			E temp = a[head];
			head = head % a.length;
			size--;
			return temp;
		}
	}
	
	public E element(){
		if (size == 0){
			System.out.println("Queue is empty");
			System.exit(0);
		}
		return a[head];
	}
	
	public E peek() {
		if (size <= 0)
			return null;
		return a[head];
	}
	
	public boolean isEmpty() {
		return (size <= 0);
	}
	
	public boolean isFull() {
		return (size >= a.length);
	}
	
	public String toString() {
		int i=head;
		String s=" ";
		for(int c=1;c<=size;c++) {
			s=s+a[i]+" ";
			i=(i+1)%a.length;
		}
		return s;
	}
	
	public static void main(String[] args) {
		MyQueueArray<Integer> arr=new MyQueueArray<Integer>();
		arr.add(4);
		arr.add(8);
		arr.add(3);
		arr.add(10);
		/*arr.add(6);
		arr.add(1);
		arr.add(81);
		arr.add(32);
		arr.add(101);
		arr.add(61);
		arr.add(12);*/
		System.out.println(arr.toString());
		arr.remove();
		System.out.println(arr.toString());
		System.out.println(arr.element());
		//System.out.println(arr.toString());

		
	}
}

