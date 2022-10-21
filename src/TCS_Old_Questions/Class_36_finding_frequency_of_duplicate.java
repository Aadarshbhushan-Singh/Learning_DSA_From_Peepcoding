package TCS_Old_Questions;
import java.util.*;
import java.util.stream.Collectors;

public class Class_36_finding_frequency_of_duplicate {
	public static void main(String[] args) {
		int[] arr = {100,100,100,2,3,6,8,90,58,58,60};
		int len = arr.length;
		int[] arr2 = DuplicateArray(len, arr);
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
	
	static int[] DuplicateArray(int input1, int[] input2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < input1; i++) {
			if(map.containsKey(input2[i])) {
				if(arr.contains(input2[i])==false) {
					arr.add(input2[i]);
				}
				
			}else {
				map.put(input2[i], 1);
			}
		}
		
		ArrayList<Integer> newList = arr;
		Collections.sort(newList);
		
		int len = newList.size();
		
		
		if(len == 0) {
			int[] finalArr = {-1};
			return finalArr;
		}
		
		int[] finalArr = new int[len];
		
		 
		for(int i = 0; i < len; i++) {
			finalArr[i] = newList.get(i);
		}
		
		
		return finalArr;
	}
}
