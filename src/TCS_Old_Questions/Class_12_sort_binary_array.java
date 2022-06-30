package TCS_Old_Questions;

public class Class_12_sort_binary_array {
	public static void main(String[] args) {
		int[] arr = {0,0,1,0,1,1,1,1,0,1,1,1,0,1,0,1};
		
		int start = 0;
		int end = arr.length-1;
		int i = 0;
		
		while(start < end) {
			if(arr[i] == 0) {
				start++;
				i++;
			}else {
				swap(arr, start, end);
				end--;
			}
		}
		
		
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
	}
	
	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
