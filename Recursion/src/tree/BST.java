package tree;


public class BST <E>{
	private class Node<E>{
		private E info;
		private Node left, right;
		public Node(Comparable<E> info) {
			this.info=(E) info;
			this.left=this.right=null;
			
		}
		public Node(E info,Node l,Node r) {
			this.info=info;
			this.left=l ;
			this.right=r;
		}
	}
	private Node root;
	private Node<E> add(Comparable<E> value, Node r){
		if(r==null) {
			r=new Node(value);
		return r;
		}
		else
			if(value.compareTo((E) r.info)<0) {
				r.left=add(value,r.left);
				return r;
			}
			else
				if(value.compareTo((E) r.info)>0) {
					r.right=add(value,r.right);
					return r;
				}
				else {
					System.out.println("Da co gia tri trong cay");
					return r;
				}
	}
	public void add(Comparable<E> value) {
		root=add(value,root);
	}
	private void inOrder(Node r) {
		if(r!=null) {
			System.out.println(r.info+" ");
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
			System.out.println(r.info);
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
			System.out.println(r.info);
		}
	}
	public void postOrder() {
		postOrder(root);
	}
	private boolean search(E value,Node r){
		if(r==null)
			return null;
		if(value.equals(r.info)<0)
			return 1;
	}
	public static void main(String[] args) {
		BST<Integer> tree=new BST<Integer>();
		tree.add(10);
		tree.add(4);
		tree.add(18);
		tree.add(-4);
		tree.add(8);
		tree.add(15);
		tree.inOder();
		System.out.println();
		tree.search(20);
	}
}
