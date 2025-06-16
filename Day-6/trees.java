public class trees {
	public static void main (String[] args) {
		Tree t=new Tree(new int[] {1,2,-1,-1,3,-1,-1});
		System.out.print("The Pre Order transversal is:");
		t.preOrder();
		System.out.println("");
		System.out.print("The post Order transversal is:");
		t.postOrder();
		System.out.println("");
		System.out.print("The In Order transversal is:");
		t.inOrder();
	}
}
class Node {
	int data;
	Node right;
	Node left;
	Node(int data) {
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
class Tree {
	Node root;
	int index=-1;
	Tree(int[] nodes) {
		this.root=buildTreesUsingArray(nodes);
	}
	public Node buildTreesUsingArray(int[] nodes) {
		index++;
		if(index>=nodes.length) {
			return null;
		}
		if(nodes[index]==-1) return null;
		Node newNode=new Node(nodes[index]);
		newNode.left=buildTreesUsingArray(nodes);
		newNode.right=buildTreesUsingArray(nodes);
		return newNode;
	}
	public void preOrder() {
		Node temp=this.root;
		preOrderHelper(temp);
	}
	private void preOrderHelper(Node temp) {
		if(temp==null) return;
		System.out.print(temp.data+" ");
		preOrderHelper(temp.left);
		preOrderHelper(temp.right);
	}
	public void inOrder() {
		Node temp=root;
		inOrderHelper(temp);
	}
	private void inOrderHelper(Node temp) {
		if(temp==null) return;
		inOrderHelper(temp.left);
		System.out.print(temp.data+" ");
		inOrderHelper(temp.right);
	}
	public void postOrder() {
		Node temp=root;
		postOrderHelper(temp);
	}
	private void postOrderHelper(Node temp) {
		if(temp==null) return;
		postOrderHelper(temp.left);
		postOrderHelper(temp.right);
		System.out.print(temp.data+" ");
	}
	public int heightOff(Node root){
	    if(root==null) return 0;
	    int ln=heightOff(root.left);
	    int rh=heightOff(root.right);
	    return Math.max(ln,rh);
	}
	}