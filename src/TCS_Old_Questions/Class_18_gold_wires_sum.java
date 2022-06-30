package TCS_Old_Questions;
import java.util.*;
/*
 * Suppose, Arr[]={7,6,8,6,1,1,}

{7,6,8,6,1,1}-{7,6,8,6,2} , cost =2

{7,6,8,6,2}- {7,6,8,8}, cost = 8

{7,6,8,8} – {13,8,8}, cost=13

{13,8,8} -{13,16}, cost=16

{13, 16} – {29}, cost =29

2+8+13+16+29=68
 * */
public class Class_18_gold_wires_sum {
	public static void main(String[] args) {
		int[] arr = {7,6,8,6,1,1,};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(solve(arr, arr.length));
	}
	
	static int solve(int[] arr, int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i = 0; i < n; i++) {
			pq.add(arr[i]);
		}
		
		
		int sum = 0;
		int temp1, temp2;
		
		while(pq.size() >= 2) {
			temp1 = pq.poll();
			temp2 = pq.poll();
			sum = sum + temp1 + temp2;
			pq.add(temp1 + temp2);
		}
		
		return sum;
	}
	
	
}
