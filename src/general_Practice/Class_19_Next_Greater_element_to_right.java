package general_Practice;
import java.util.*;
public class Class_19_Next_Greater_element_to_right {
	public static void main(String[] args) {
		System.out.println("Started");
		int[] arr = {1,4,2,6,9,5,6,8};
		
		Stack<Integer> st = new Stack<Integer>();
		int lenArray = arr.length;
		int[] ans = new int[lenArray];
		
		st.push(arr[lenArray-1]);
		
		System.out.println(st);
		System.out.println(st.peek());
		for(int i = lenArray-1; i>=0; i--) {
			if(arr[i]<st.peek()) {
				System.out.println(i + " " + arr[i] + " < " + st.peek());
			}
//			if(arr[i] < st.peek()) {
//				ans[i] = st.peek();
//			}else {
//				arr[i] = -1;
//				st.pop();
//			}
		}
		
		
		System.out.println(st);
		System.out.println(ans);
		
	}
}
