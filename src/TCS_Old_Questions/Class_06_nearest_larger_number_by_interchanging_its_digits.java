package TCS_Old_Questions;
import java.util.*;

/*
 * 1. Concept: First convert a into string and find its permutation and store it in an array form
 * 2. Then iterate through the array and fill the element and the difference of array in the hashmap
 * 3. Now iterate through the hashmap and find the smallest value
 * 4. To find the smallest value - make on temp variable for key and value (initialize value with the max number possible)
 * 	  and update them if the value is smaller than current value
 * 5. The key of the smallest value will be the answer
 * */

public class Class_06_nearest_larger_number_by_interchanging_its_digits {
	
	public static void main(String[] args) {
		int x = 645757;
		int y = 457765;
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		//Convert x into String to find the permutation
		String strX = String.valueOf(x);
		findPermutation(strX, "", arr);
		
		//HashMap to fill the permuted number and its difference 
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int ele: arr) {
			if(ele - y > 0) {
				map.put(ele, ele - y);
			}
		}
		
		System.out.println(map);
		
		//Finding the smallerst value in hashmap
		int ans = 0;
		int valueAns = Integer.MAX_VALUE;
		Set<Integer> set = map.keySet();
		
		for(int ele: set) {
			if(map.get(ele) < valueAns) {
				ans = ele;
				valueAns = map.get(ele);
			}
		}
		
		System.out.println(ans);
	}
	
	static void findPermutation(String str, String asf, ArrayList<Integer> arr) {
		if(str.length() == 0) {
			int x = Integer.parseInt(asf);
			arr.add(x);
			return;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String left = str.substring(0, i);
			String right = str.substring(i+1);
			String remString = left + right;
			
			findPermutation(remString, asf + ch, arr);
		}
	}
	
	
}
