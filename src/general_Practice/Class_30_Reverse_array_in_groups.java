package general_Practice;
import java.util.*;

public class Class_30_Reverse_array_in_groups {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(11);
		arr.add(12);
		arr.add(192);
		arr.add(34);
		arr.add(92);
		arr.add(59);
		arr.add(45);
		
	}
	

	 void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
//	        run the loop from 0 to k-1 till i + k < n
//	        then run the loop in remaining part i.e i+k, n-1
	        int i = 0;
	        while(i + k < n){
	             reverse(arr, n, i, i+k-1);
	             i=i+k;
	        }
	        reverse(arr, n, i, n-1);
	    }
	    
	    void reverse(ArrayList<Integer> arr, int n, int start, int end){
	        for(int i = start, j = end; i < j; i++, j--){
	            Collections.swap(arr, i, j);
	        }
	    }
}
