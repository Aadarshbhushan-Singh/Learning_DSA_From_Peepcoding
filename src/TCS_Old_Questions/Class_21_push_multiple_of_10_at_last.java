package TCS_Old_Questions;

public class Class_21_push_multiple_of_10_at_last {
	public static void main(String[] args) {
		int[] arr = {10, 12, 5, 40, 30, 7, 50, 9, 10};
		int i = 0;
		int j = arr.length-1;
		
		while(i < j) {
			if(arr[i] % 10 == 0) {
				swap(arr, i, j);
				j--;
			}else {
				i++;
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
