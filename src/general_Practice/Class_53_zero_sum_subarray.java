package general_Practice;
import java.util.*;


public class Class_53_zero_sum_subarray {
	public static void main(String[] args) {
		int[] arr = {5,3,-2,-1,0};
		int n = arr.length;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int sum = 0;
		boolean flag = false;
		
		for(int i = 0; i < n; i++) {
			sum = sum + arr[i];
			if(map.containsKey(sum)) {
				flag = true;
			}
			map.put(sum, 1);
		}
		
		System.out.println(flag);
		
	}
}
