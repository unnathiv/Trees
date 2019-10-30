
class Node{
	
	int key;
	Node left;
	Node right;
	public Node(int key) {
		super();
		this.key = key;
		this.left = null;
		this.right = null;
	}	
	
	
}

public class TraversalsRecursion {
	
	Node root;
     
	public void inOrder(Node node) {
		
		if(node == null)
			return;
		
		inOrder(node.left);
		
		System.out.println(node.key);
		
		inOrder(node.right);	
	}
	public void postOrder(Node node) {
		if(node == null)
			return;
		
		inOrder(node.left);
		
		inOrder(node.right);

		System.out.println(node.key);	
	}
	public void preOrder(Node node) {
		
		if(node == null)
			return;
		
		System.out.println(node.key);
		
		inOrder(node.left);
		
		inOrder(node.right);	
		
	}
	
	public static void main(String args[]) {
		
		TraversalsRecursion tree = new TraversalsRecursion(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        System.out.println("Preorder traversal of binary tree is "); 
        tree.preOrder(); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.inOrder(); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.postOrder(); 
		
	}
	
}
