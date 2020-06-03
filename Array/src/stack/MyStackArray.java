package stack;

public class MyStackArray<E> {
	private E []a;
	private int top,size;
	public MyStackArray() {
		top=-1;
		size=0;
		a=(E[]) new Object[10];
	}
	//khoi tao Stack rong
	public boolean empty() {
		if(top==-1)
			return true;
		else return false;
	}
	//Day e vao dinh Stack
	public E push(E e) {
		if(top==a.length-1) {
			System.out.println("Stack is full");
			return null;
		}
		else {
			top++;
			a[top]=e;
			size++;
		}
		return e;
	}
	//Tra ve e nam o dinh Stack
	public E peek() {
		if(top==-1) {
			System.out.println("Sack is empty");
			return null;
		}
		else return a[top];
	}
	//Tra ve e nam o dinh Stack va loai bo
	public E pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
			E tmp=a[top];
			a[top]=null;
			top--;
			size--;
			return tmp;
		}
	}
	@Override
	public String toString() {
		String s=" ";
		for(int i=0;i<=top;i++)
			s=s+a[i]+" ";
		return s;
	}
	//Tra ve vi tri cua phan tu e(vi tri) -1 neu k co
	public int search(E e) {
		for(int i=top;i>=0;i++)
			if(a[i]==e) return size-i;
		return -1;
	}

	public static void main(String[] args) {
		MyStackArray<Integer> arr=new MyStackArray<Integer>();
		arr.push(3);
		arr.push(8);
		arr.push(7);
		arr.push(4);
		System.out.println(arr.toString());
		System.out.println(arr.peek());
		System.out.println(arr.pop());
		System.out.println(arr.toString());
		System.out.println(arr.search(7));
	}

}
