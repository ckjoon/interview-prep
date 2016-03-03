public class BT{
	private Node root;
	public BT(){
		root= null;
	}
	
	public void addNode(int val){
		Node temp = new Node(val);
		if(root == null){
			root=temp;
		}else{
		 	Node cur = root;
			while(cur.getRight()!=null||cur.getLeft()!=null){
				
			}
		}
	}
}
