package general_Practice;
import java.util.*;

public class Class_22_Finding_Majority_Element_No_Extra_Space {
	public static void main(String[] args) {
//		int[] arr = {1,2,1,4,3, 5, 3,4,3,8,9};
		int[] arr = {1,3,1,4,3, 3, 3,3,3,8,3};
		int ele = arr[1];
		int count = 1;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i]==ele) {
				count++;
			}else {
				count--;
			}
			
			if(count == 0) {
				ele = arr[i];
				count=1;
			}
		}
		
		int count2 = 0;
		for(int i = 0; i < arr.length; i++) {
			if(ele == arr[i]) {
				count2++;
			}
		}
		
		if(count2 > arr.length/2) {
			System.out.println(ele);
		}else {
			System.out.println(-1);
		}
	}
}
