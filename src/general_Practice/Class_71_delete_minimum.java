package general_Practice;
import java.util.*;

public class Class_71_delete_minimum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int num = scn.nextInt();
			arr.add(num);
		}
		int sum = 0;
		while(arr.size() > 1) {
//			System.out.println("Arr: " + arr);
			int min = Collections.min(arr);
			sum = sum + min;
//			System.out.println(sum);
			int minIndex = arr.indexOf(min);
			if(minIndex == 0) {
				arr.remove(minIndex);
				arr.remove(minIndex);
			}else if(minIndex == arr.size() - 1) {
				arr.remove(minIndex);
				arr.remove(minIndex-1);
			}else {
				arr.remove(minIndex);
				arr.remove(minIndex);
				arr.remove(minIndex-1);
			}
		}
		
		if(arr.size() > 0) {
			sum = sum + arr.get(0);
		}
		
		System.out.println(sum);
	}
}
