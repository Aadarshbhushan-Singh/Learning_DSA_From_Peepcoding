package HashMap_and_Heaps;
import java.util.*;

public class Class_06_Sort_Nearly_Sorted_Array {
	public static void main(String[] args) {
		int[] arr = {2,3,1,4,6,7,5,8,9};
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int k = 3;
		
		for(int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		
		for(int i = k; i < arr.length; i++) {
			System.out.println(pq.remove());
			pq.add(arr[i]);
		}
		
		while(pq.size() > 0) {
			System.out.println(pq.remove());
		}
	}
}
