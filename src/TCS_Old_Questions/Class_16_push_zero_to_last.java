package TCS_Old_Questions;

public class Class_16_push_zero_to_last {
	public static void main(String[] args) {
		int[] arr = {6,0,1,8,0,2};
		
		int start = 0;
		int end = arr.length-1;
		int i = 0;
		while(start < end) {
			if(arr[i] == 0) {
				swap(arr, start, end);
				end--;
			}else {
				start++;
				i++;
			}
		}
		
		for(int ele: arr) {
			System.out.println(ele);
		}
	}
	
	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
