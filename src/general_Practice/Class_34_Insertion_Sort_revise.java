package general_Practice;

public class Class_34_Insertion_Sort_revise {
	public static void main(String[] args) {
		int[] arr = {7,6,1,4,1,8};
		
		insertionSort(arr);
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
	}
	
	static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i-1;
			while(j >= 0 && current < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = current;
		}
	}
}
