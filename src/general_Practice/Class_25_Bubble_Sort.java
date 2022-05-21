package general_Practice;

public class Class_25_Bubble_Sort {
	public static void main(String[] args) {
		int[] arr = {1,5,3,7,5,6,7,8};
		
		printArray(arr);
		bubbleSort(arr);
		System.out.println();
		printArray(arr);
		
	}
	
	
	public static void bubbleSort(int[] arr) {
		int size = arr.length;
		
		for(int i = 0; i < size -1; i++) {
			for(int j = 0; j < size - i -1; j++) {
				// Just change '>' to '<' for sort array in decreasing order
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArray(int[] arr) {
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
	}
}
