package binaryTree;
import java.util.*;


public class Class_04_Level_Order_Traversal {
	public static void main(String[] args) {
		Node node = new Node(10);
		node.left = new Node(20);
		node.right = new Node(30);
		node.left.left = new Node(40);
		node.left.right = new Node(50);
		node.right.left = new Node(60);
		node.right.right = new Node(70);
		
		levelOrderTraversal(node);
	}
	
	static void levelOrderTraversal(Node root) {
		Queue<Node> mainQueue = new LinkedList<>();
		mainQueue.add(root);
		
		while(mainQueue.size() > 0) {
				Node temp = mainQueue.remove();
				System.out.print(temp.data + " ");
				
				if(temp.left != null) {
					mainQueue.add(temp.left);
				}
				
				if(temp.right != null) {
					mainQueue.add(temp.right);
				}
					
		}
		System.out.println();
		
	}
}
