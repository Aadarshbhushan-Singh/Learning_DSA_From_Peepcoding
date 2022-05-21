package hashMap_and_Heaps;
import java.util.*;

public class Class_05_Kth_Largest_Element {
	public static void main(String[] args) {
		int[] arr = {4,3,2,6,7,8,4,4};
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int ele: arr) {
			pq.add(ele);
		}
		System.out.println(pq);
		
		int k = 5;
		for(int i = 0; i < k-1; i++) {
			pq.remove();
		}
		
		System.out.println(pq.peek());
	}
}
