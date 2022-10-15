package TCS_Old_Questions;
import java.util.*;

public class Class_33_mid_without_negative {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int ele = scn.nextInt();
			if(ele > -1) {
				arr.add(ele);
			}
		}
		
		int size = arr.size();
		if(size % 2 == 0) {
			System.out.println(arr.get(size/2 -1));
		}else {
			System.out.println(arr.get(size/2));
		}
	}
}
