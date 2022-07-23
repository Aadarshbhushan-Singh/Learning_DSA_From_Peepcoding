package binaryTree;
import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
	}
}

public class Class_03_Left_View {
	public static void main(String[] args) {
		Node node = new Node(10);
		node.left = new Node(20);
		node.right = new Node(30);
		node.left.left = new Node(40);
		node.left.right = new Node(50);
		node.right.left = new Node(60);
		node.right.right = new Node(70);
		
		leftView(node);
	}
	
	static void leftView(Node root) {
		Queue<Node> mainQueue = new LinkedList<>();
		
		mainQueue.add(root);
		
		while(mainQueue.size() > 0) {
			int n = mainQueue.size();
			
			for(int i = 0; i < n; i++) {
				Node temp = mainQueue.remove();
				
				if(i == n-1) {
					System.out.println(temp.data);
				}
				
				if(temp.right != null) {
					mainQueue.add(temp.right);
				}
				
				if(temp.left != null) {
					mainQueue.add(temp.left);
				}
			}
		}
	}
}
