package general_Practice;

public class Class_32_Bubble_Sorting_revision {
	public static void main(String[] args) {
		int[] arr = {7,6,8,4,1,2};
		
		bubbleSort(arr);
		for(int ele: arr) {
			System.out.print(ele);
		}
	}
	
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = n-1; i >= 0; i--) {
			for(int j = 0; j <= i-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}else {
					continue;
				}
			}
		}
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
