public class Node{
	private int val;
	private Node left;
	private Node right;
	public Node(int val){
		this.val=val;
		left=null;
		right=null;
	}
	public Node(){
		val = 0;
		left= null;
		right = null;
	}
	public Node getLeft(){
		return left;
	}
	public Node getRight(){
		return right;
	}
	public int getVal(){
		return val;
	}
	public void setVal(int val){
		this.val=val;
	}
	public void setLeft(Node left){
		this.left=left;
	}
	public void setRight(Node right){
		this.right=right
	}
}	
