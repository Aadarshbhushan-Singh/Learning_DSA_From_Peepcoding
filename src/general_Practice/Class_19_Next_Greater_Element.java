package general_Practice;
import java.util.Stack;

public class Class_19_Next_Greater_Element {

	public static void main(String[] args) {
		System.out.println("Started");
		int[] arr = {1,4,2,6,9,5,6,8};
		
		Stack<Integer> st = new Stack<Integer>();
		int lenArray = arr.length;
		int[] ans = new int[lenArray];
		
		st.push(arr[lenArray-1]);
		ans[lenArray-1] = -1;
		
		for(int i = lenArray - 2; i>=0; i--) {
			System.out.println("Entered for loop");
			while(st.peek() <= arr[i] && st.size() > 0) {
				System.out.println("Entered while loop");
				st.pop();
				System.out.println("Exit while loop");
			}
			if(st.size() == 0) {
				ans[i] = -1;
			}else {
				ans[i] = st.peek();
			}
			
			st.push(arr[i]);
			
			System.out.println("Exit for loop");
		}
		//s
		
		System.out.println(st);
		for(int ele: ans) {
			System.out.print(ele + " ");
		}
	}
}
