package binaryTree;
import java.util.*;


public class Class_01_PreOrder_Tree_Creating {
	//Making a node class
	public static class Node{
		int data;
		Node left;
		Node right;
		
		//This constructor will keep data while making a new node
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	//This is BinaryTree class
	//static idx is used to keep the index increasing each time the function is called.
	public static class BinaryTree{
		static int idx = -1;
		public static Node buildTree(int[] nodes) {
			idx++;
			
			if(nodes[idx] == -1) {
				return null;
			}
			
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			
			return newNode;
			
		}
		
		//This is pre-order traversal RLF
		//We are traversing all nodes one by one so it's time complexity will be O(n)
		public static void preOrderTraversal(Node root) {
			if(root == null) {
				return;
			}
			System.out.print(root.data + " ");
			
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
		
		//This is inorder traversal - Left-Root-Right
		public static void inOrderTraversal(Node root) {
			if(root == null) {
				return;
			}
			inOrderTraversal(root.left);
			System.out.print(root.data + " ");
			inOrderTraversal(root.right);
		}
		
		public static void postOrderTraversal(Node root) {
			if(root == null) {
				return;
			}
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data + " ");
		}
		
		public static void levelOrder(Node root) {
			if(root == null) {
				return;
			}
			
			Queue<Node> q = new LinkedList<>();
			
			q.add(root);
			q.add(null);
			
			while(q.size() > 0) {
				Node currNode = q.remove();
				
				if(currNode == null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					}else {
						q.add(null);
					}
				}else {
					System.out.print(currNode.data + " ");
					if(currNode.left != null) {
						q.add(currNode.left);
					}
					
					if(currNode.right != null) {
						q.add(currNode.right);
					}
				}
			}
		}
		
		//count of nodes in binary tree
		public static int totalBinaryNodes(Node root) {
			if(root == null) {
				return 0;
			}else {
				int leftNode = totalBinaryNodes(root.left);
				int rightNode = totalBinaryNodes(root.right);
				return leftNode + rightNode + 1;
			}
		}
		
		//sum of nodes in binary tree
		public static int sumOfNodes(Node root) {
			if(root == null) {
				return 0;
			}
			
			int leftSum = sumOfNodes(root.left);
			int rightSum = sumOfNodes(root.right);
			
			int totalSum = leftSum + rightSum + root.data;
			
			return totalSum;
		}
		
		//height of tree - heigt is difference of deepest node level and root level
		public static int heightOfTree(Node root) {
			if(root == null) {
				return 0;
			}
			
			int leftHeight = heightOfTree(root.left);
			int rightHeight = heightOfTree(root.right);
			
			int maxHeight = Math.max(leftHeight, rightHeight);
			
			return maxHeight + 1;
		}
		
		//find the diameter of node here height is used inside the function so complexity will be O(n^2)
		public static int diameter(Node root) {
			if(root == null) {
				return 0;
			}
			int diam1 = diameter(root.left);
			int diam2 = diameter(root.right);
			int height = heightOfTree(root.left) + heightOfTree(root.right) + 1;
			
			return (Math.max(diam1, Math.max(diam2, height)));
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		
//		System.out.println(root.data);
		
		System.out.println("Inorder Traversal: ");
		tree.preOrderTraversal(root);
		System.out.println("\nPre Order Traversal: "); 
		tree.inOrderTraversal(root);
		System.out.println("\nPost Order Traversal: "); 
		tree.postOrderTraversal(root);
		System.out.println("Level Order Traversasl: ");
		tree.levelOrder(root);
		
		System.out.println("Count of Nodes; ");
		System.out.println(tree.totalBinaryNodes(root));
		System.out.println("Sum of Nodes: ");
		System.out.println(tree.sumOfNodes(root));
		
		System.out.println("Height of Tree: ");
		System.out.println(tree.heightOfTree(root));
		
		System.out.println("Diameter of Tree: ");
		System.out.println(tree.diameter(root));
	}

}
