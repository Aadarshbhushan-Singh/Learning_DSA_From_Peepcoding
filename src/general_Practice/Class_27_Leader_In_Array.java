package general_Practice;
import java.util.*;

public class Class_27_Leader_In_Array {
	public static void main(String[] args) {
		/*
		 * Leader in an array is the element which is greater than right most element
		 *
		 * Bruteforce Approach: 
		 * You can traverse through array two times to find the leader. Time Complexity: O(n^2)
		 * 
		 * 
		 * Optimized Approach: 
		 * Take rightmost element as max element and traverse the array from right side and if the current element is 
		 * greater than rightmost element, it should be leader.
		 * 
		 * 
		 * */
		
		int[] arr = {3,5,10,3,5,8,2,3,7,5};
		int n = arr.length;
		
		//Take rightmost element as max
		int max = arr[n-1];
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		//Righmost element is always a leader
		ans.add(arr[n-1]);
		
		for(int i = n-1; i >= 0; i--) {
			if(arr[i] > max) {
				ans.add(arr[i]);
				max = arr[i];
			}
		}
		
		
		//Reversing the arraylist to return the element in same order as it was in array
		Collections.reverse(ans);
		
		System.out.println(ans);
		
	}
}
