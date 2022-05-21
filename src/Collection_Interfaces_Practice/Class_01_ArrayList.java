package Collection_Interfaces_Practice;
import java.util.*;

public class Class_01_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(32);
		list1.add(76);
		list1.add(0);
		
		System.out.println(list1);
		list1.remove(0);
		System.out.println(list1);
		
		boolean present = list1.contains(32);
		System.out.println(present);
		
		System.out.println(list1.indexOf(76));
		System.out.println(list1.get(1));
		
		list1.add(10);
		list1.add(32);
		list1.add(76);
		list1.add(43);
		
		System.out.println(list1);
		
		for(int ele: list1) {
			System.out.print(ele * 10 + " ");
		}
		
		System.out.println();
		Iterator<Integer> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.print((itr.next() * 20) + " ");
		}
		
		
	}
}
