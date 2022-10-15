package TCS_Old_Questions;

import java.util.ArrayList;

public class Class_32_bitwise_on_arrays {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr1.add(1);
		arr1.add(2);
		arr2.add(4);
		arr2.add(10);
		
		System.out.println(solve(arr1, arr2));
	}
	
	static int solve(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		int size = arr1.size() * arr2.size();
		int[] solution = new int[size];
		
		int ind = 0;
		for(int i = 0; i < arr1.size(); i++) {
			for(int j = 0; j < arr2.size(); j++) {
				solution[ind] = arr1.get(i) | arr2.get(j);
				ind++;
			}
		}
		
		int ans = solution[0];
		for(int i = 1; i < solution.length; i++) {
			ans = ans ^ solution[i];
		}
		
		return ans;
	}
}
