package general_Practice;
import java.util.*;

public class Class_23_Next_Greater_Element {
	public static void main(String[] args) {
		int[] arr = {1,4,2,6,7,4,3,2,9,7,5,3,11,5,8};
//		int[] ans = {4,6,6,7,9,9,9,9,11,11,11,11,-1,8,-1};
		
		int lenArr = arr.length;
		int[] ans = new int[lenArr];
		ans[lenArr-1] = -1;
		
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(arr[lenArr-1]);
		
//		for(int i = lenArr-2; i>=0; i--) {
//			int ele = arr[i];
//			
//			if(ele < stk.peek()) {
//				ans[i] = stk.peek();
//				stk.push(ele);
//			}else {
//				while(ele > stk.peek()) {
//					stk.pop();
//				}
//				
//				ans[i] = stk.peek();
//				stk.push(ele);
//			}
//		}
//		
//		System.out.println("Hello");
//		
////		for(int ele: ans) {
////			System.out.print(ele + " ");
////		}

	}

}
