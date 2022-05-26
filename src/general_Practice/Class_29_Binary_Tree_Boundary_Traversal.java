package general_Practice;

public class Class_29_Binary_Tree_Boundary_Traversal {
	public static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static class BinaryTree{
		Node root;
		
		public void leftSideTraversal(Node node) {
			if(node == null) {
				return;
			}
			
			if(node.left == null && node.right == null) {
				return;
			}
			
			System.out.print(node.data + " ");
			
			
			if(node.left != null) {
				leftSideTraversal(node.left);
			}else if(node.right != null) {
				leftSideTraversal(node.right);
			}
		}
		
		public void leafTraversal(Node node) {
			if(node == null) {
				return;
			}
			
			leafTraversal(node.left);
			
			if(node.left == null && node.right == null) {
				System.out.print(node.data + " ");
			}
			
			leafTraversal(node.right);
		}
		
		public void rightSideTraversal(Node node) {
			if(node == null) {
				return;
			}
			
			if(node.left == null && node.right == null) {
				return;
			}
			
			if(node.right != null) {
				rightSideTraversal(node.right);
				System.out.print(node.data + " ");
			}else if(node.left != null) {
				rightSideTraversal(node.left);
				System.out.print(node.data + " ");
			}
		}
		
		void printBoundary(Node node)
	    {
	        if (node == null)
	            return;
	 
	        System.out.print(node.data + " ");
	        
	        leftSideTraversal(node.left);
	        leafTraversal(node.left);
	        leafTraversal(node.right);
	        rightSideTraversal(node.right);
	        
	        
	    }
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
        tree.printBoundary(tree.root);
	}
}
