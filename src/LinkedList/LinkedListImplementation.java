package LinkedList;


public class LinkedListImplementation {
	public static class Node{
		int data;
		Node next;
	}
	
	public static class LinkedList{
		Node head;
		Node tail;
		int size;
		
		void addLast(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = null;
			
			if(size == 0) {
				head = temp;
				tail = temp;				
			}else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}
		
		void display() {
			Node temp = new Node();
			temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			
			System.out.println("\n"+ "Size: " + size);
		}
		
		int removeFirst() {
			Node temp = new Node();
			
			if(head.next == null) {
				head = null;
				size--;
				return -1;
			}else {
				temp.data = head.next.data;
				temp.next = head.next.next;			
				head = temp;
				size--;
				return head.data;
			}
			
			
		}
		
		public int getFirst() {
			if(size == 0) {
				System.out.println("No data in linked list.");
				return -1;
			}else {
				return head.data;
			}
		}
		
		public int getLast() {
			if(size == 0) {
				System.out.println("No data in linked list.");
				return -1;
				
			}else {
				return tail.data;
			}
		}
		
		public int getIndex(int ind) {
			
			if(size == 0) {
				System.out.println("No element in the list.");
				return 0;
			}else if(ind < 0 || ind > size){
				System.out.println("Invalid Input");
				return -1;
			}else {
				Node temp = new Node();
				temp = head;
				for(int i = 0; i < ind; i++) {
					temp= temp.next;
				}
				return temp.data;
			}
		}
		
		
		public void addFirst(int data) {
			if(size == 0) {
				Node temp = new Node();
				temp.data = data;
				temp.next = null;
				head = temp;
				tail = temp;				
			}else {
				Node temp = new Node();
				temp.data = data;
				temp.next = head;
				head=temp;
			}
			size++;
		}
		
		
		public void addAt(int ind, int val) {
			if(ind < 0 || ind > size) {
				System.out.println("Invalid Argument");
			}else if(ind == 0) {
				addFirst(val);
			}else if(ind == size) {
				addLast(val);
			}else {
				Node temp = new Node();
				temp.data = val;
				
				Node temp1 = head;
				for(int i = 0; i < ind-1; i++) {
					temp1 = temp1.next;
				}
				temp.next = temp1.next;
				temp1.next = temp;
				
				size++;
			}
		}
		
		public void removeLast() {
			if(size == 0) {
				System.out.println("List is null.");
			}else if(size == 1) {
				head = tail = null;
				size--;
			}else {
				Node temp = new Node();
				temp = head;
				for(int i = 0; i < size-2; i++) {
					temp = temp.next;
				}
				temp.next = null;
				size--;
			}
		}
		
		private Node getNodeAt(int ind) {
			if(size == 0) {
				System.out.println("List is empty.");
				return null;
			}else if(ind < 0 || ind > size) {
				System.out.println("Invalid index.");
				return null;
			}else {
				Node temp = new Node();
				temp = head;
				for(int i = 0; i < ind; i++) {
					temp = temp.next;
				}
				return temp;
			}
		}
		
		public void reverseList() {
			int left = 0;
			int right = size - 1;
			
			while(left < right) {
				Node leftNode = getNodeAt(left);
				Node rightNode = getNodeAt(right);
				
				int temp = leftNode.data;
				leftNode.data = rightNode.data;
				rightNode.data = temp;
				
				left++;
				right--;
			}
		}
		
		public void removeAt(int ind) {
			if(size == 0) {
				System.out.println("List is empty.");
			}else if(ind == 0) {
				removeFirst();
			}else if(ind == size - 1){
				removeLast();
			}else {
				Node temp = new Node();
				for(int i = 0; i < ind -1; i++) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
				size--;
			}
		}
		
		
		public int kthElementFromLast(int ind) {
			Node first = new Node();
			Node second = new Node();
			
			first = head;
			second = head;
			
			for(int i = 0; i < ind; i++) {
				second = second.next;
			}
			
			while(second != null) {
				first = first.next;
				second=second.next;
			}
			
			return first.data;
		}
		
		public int middleOfList() {
			Node first = head;
			Node second = head;
			
			while(second.next != null && second.next.next != null) {
				first = first.next;
				second = second.next.next;
			}
			
			return first.data;
		}
		
		
	}
	
	//Stack implemented in form of Linked List
	public static class LinkedListToStacAdapter{
		LinkedList list1;
		
		public LinkedListToStacAdapter() {
			list1 = new LinkedList();
		}
		
		public int size() {
			return list1.size;
		}
		
		public void push(int data) {
			list1.addFirst(data);
		}
		
		public int pop() {
			if(list1.size == 0) {
				System.out.println("Stack underflow");
				return -1;
			}else {
				return list1.removeFirst();
			}
		}
		
		public int peek() {
			if(list1.size == 0) {
				System.out.println("Stack underflow");
				return -1;
			}else {
				System.out.println(list1.getFirst());
				return list1.getFirst();
			}
		}
	}
	
	
	//Linked List implemented in the form of queue
	public class LinkedListToQueueAdapter{
		LinkedList list1;
		
		public LinkedListToQueueAdapter() {
			list1 = new LinkedList();
		}
		
		public int size() {
			return list1.size;
		}
		
		public void add(int val) {
			list1.addLast(val);
		}
		
		public int remove() {
			if(list1.size == 0) {
				System.out.println("List is empty");
				return -1;
			}else {
				return list1.removeFirst();
			}
		}
		
		public int peek() {
			System.out.println(list1.head.data);
			return list1.getFirst();
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		
		System.out.println("Adding: ");
		list1.addLast(20);
		list1.addLast(30);
		list1.addLast(67);
		list1.addLast(43);
		list1.addLast(43);
		list1.addLast(56);
		list1.addLast(43);
		list1.addLast(45);
		list1.addLast(68);
		list1.addLast(89);
		list1.display();
		
		
//		System.out.println("Removing First");
//		list1.removeFirst();
//		list1.display();
//		
//		System.out.println("Get First: ");
//		System.out.println(list1.getFirst());
//		System.out.println("Get Last: ");
//		System.out.println(list1.getLast());
//		System.out.println("Get -1");
//		System.out.println(list1.getIndex(-1));
//		System.out.println("Get 1 ");
//		System.out.println(list1.getIndex(1));
		
//		System.out.println("Add first: ");
//		list1.addFirst(98);
//		list1.display();
//		
//		System.out.println("Add at: ");
//		list1.addAt(2, 99);
//		list1.display();
//		
//		System.out.println("Remove Last: ");
//		list1.display();
//		list1.removeLast();
//		list1.display();
//		
//		System.out.println("Reverse a linked list: ");
//		list1.reverseList();
//		list1.display();
//		
//		System.out.println("3rd Element from last");
//		System.out.println(list1.kthElementFromLast(3));
//		
//		System.out.println("Middle Element of List: ");
//		System.out.println(list1.middleOfList());
		
		System.out.println(list1.middleOfList());
	}

}
