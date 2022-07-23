package binaryTree;
import java.util.*;

class Node1{
	int data;
	Node1 left;
	Node1 right;
	
	Node1(int data){
		this.data = data;
	}
}

public class Class_02_Right_View {
	public static void main(String[] args) {
		Node1 node = new Node1(10);
		node.left = new Node1(20);
		node.right = new Node1(30);
		node.left.left = new Node1(40);
		node.left.right = new Node1(50);
		node.right.left = new Node1(60);
		node.right.right = new Node1(70);
		
		rightView(node);
	}
	
	static void rightView(Node1 root) {
		Queue<Node1> mainQueue = new LinkedList<>();
		mainQueue.add(root);
		
		while(mainQueue.size() > 0) {
			int n = mainQueue.size();
			
			for(int i = 0; i < n; i++) {
				Node1 temp = mainQueue.remove();
				
				if(i == n-1) {
					System.out.println(temp.data);
				}
				
				if(temp.left != null) {
					mainQueue.add(temp.left);
				}
				
				if(temp.right != null) {
					mainQueue.add(temp.right);
				}
			}
		}
	}
}
