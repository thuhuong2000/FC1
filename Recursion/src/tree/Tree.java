package tree;

public class Tree <E>{
	private class Node<T>{
		private E info;
		private Node<T> left, right;
		public Node( E info) {
			this.info=info;
			this.left=this.right=null;
		}
		public Node(E info,Node<T> l,Node<T>r) {
			this.info=info;
			this.left=l ;
			this.right=r;
		}
	}
	private Node<E> root;
	public Tree() {
		Node r1= new Node(4,new Node(7),null);
		Node r2= new Node(1,new Node(8),new Node(10,new Node(2),new Node(5)));
		root=new Node(3,r1,r2);
	}
	
	private void inOrder(Node r) {
		if(r!=null) {
			System.out.print(r.info+" ");
			inOrder(r.left);
			inOrder(r.right);
		}
	}
	public void inOder() {
		inOrder(root);
	}
	
	private void midOrder(Node r) {
		if(r!=null) {
			midOrder(r.left);
			System.out.print(r.info);
			midOrder(r.right);
		}
	}
	public void midOrder() {
		midOrder(root);
	}
	
	private void postOrder(Node r) {
		if(r!=null) {
			postOrder(r.left);
			postOrder(r.right);
			System.out.print(r.info);
		}
	}
	public void postOrder() {
		postOrder(root);
	}
	
	private int sum(Node r) {
		if(r==null) return 0;
		else
			return (int) r.info +sum( r.left) + sum(r.right);
	}
	public void sum() {
		System.out.print("sum= " + sum(root));
	}
	
	private int sumc(Node r) {
		if(r==null) return 0;
		else {
			if((int)r.info %2==0) 
				return (int)r.info+sumc(r.left)+sumc(r.right);
			else
				return sumc(r.left)+ sumc(r.right);
		}
	}
	public void sumc() {
		System.out.print("sumChan= "+ sumc(root));
	}
	
	private int soNode(Node r) {
		if(r==null)
			return 0;
		else
			return 1+ soNode(r.left)+soNode(r.right);
	}
	public int soNode() {
		return soNode(root);
	}
	
	private int soLa(Node r) {
		if(r==null)
			return 0;
		else
			if(r.left==null && r.right==null)
			return 1;
			else
				return soLa(r.left)+soLa(r.right);
	}
	public int soLa() {
		return soLa(root);
	}
	
	private int cout1(Node r) {
		if(r==null)
			return 0;
		else
			if(r.right==null&&r.left!=null||r.right!=null&&r.left==null)
				return 1+cout1(r.left)+cout1(r.right);
			return cout1(r.left)+cout1(r.right);
	}
	public int cout1() {
		return cout1(root);
	}
	
	private int cout2(Node r) {
		if(r==null)
			return 0;
		else
			if(r.right==null&&r.left==null)
				return cout2(r.left)+cout2(r.right);
			return 1+cout2(r.left)+cout2(r.right);
	}
	public int cout2() {
		return cout2(root);
	}
	
	private int demLe(Node r) {
		if(r==null)
			return 0;
		else
			if((int)r.info%2!=0)
				return 1+ demLe(r.left)+demLe(r.right);
		return demLe(r.left)+demLe(r.right);
	}
	public int demLe() {
		return demLe(root);
	}
	
	public static void main(String[] args) {
		Tree<Integer> t = new Tree<Integer>();
		t.inOder();
//		System.out.println();
//		t.midOrder();
//		System.out.println();
//		t.postOrder();
//		System.out.println();
//		t.sum();
		System.out.println();
		t.sumc();
		System.out.println(t.soNode());
		System.out.println(t.soLa());
		System.out.println(t.cout1());
		System.out.println(t.cout2());
		System.out.println("node le:" +t.demLe());
		

	}

}