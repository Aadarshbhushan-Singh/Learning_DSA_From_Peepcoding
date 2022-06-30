package TCS_Old_Questions;

public class Class_17_Sort_012_array {
	public static void main(String[] args) {
		int[] arr = {1,2,0,1,1,1,0,1,1,2,2};
		
		sortArray(arr);
		
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
	}
	
	static void sortArray(int[] arr) {
		int i = 0;
		int j = 0;
		int k = arr.length-1;
		
		while(j <= k) {
			if(arr[j] == 0) {
				swap(arr, i, j);
				i++;
				j++;
			}else if(arr[j] == 1) {
				j++;
			}else {
				swap(arr, j, k);
				k--;
			}
		}
	}
	
	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
