package Collection_Interfaces_Practice;
import java.util.*;

public class Class_02_LinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		list1.add(23);
		list1.add(10);
		list1.add(32);
		list1.add(76);
		list1.add(0);
		
		System.out.println(list1);
		
		list1.addFirst(100);
		list1.addLast(200);
		list1.add(2, 300);
		
		System.out.println(list1);
		
		//Remove functions removes element from first
		list1.remove();
		System.out.println(list1);
		
		list1.removeFirst();
		System.out.println(list1);
		
		list1.removeLast();
		System.out.println(list1);
		
		//Remove(index) deletes the element from given index
		list1.remove(1);
		System.out.println(list1);
		
		boolean present = list1.contains(76);
		System.out.println(present);
		
		System.out.println(list1.size());
		
		System.out.println(list1.get(2));
		System.out.println(list1.indexOf(76));
		
		System.out.println(list1.offerFirst(99));
		System.out.println(list1);
		
		System.out.println(list1.offerLast(null));
		System.out.println(list1);
		
		Iterator<Integer> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() * 2 + " ");
		}
		
		
		
	}
}
