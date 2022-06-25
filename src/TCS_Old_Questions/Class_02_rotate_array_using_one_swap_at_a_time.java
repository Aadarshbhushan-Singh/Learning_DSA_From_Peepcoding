package TCS_Old_Questions;

public class Class_02_rotate_array_using_one_swap_at_a_time {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
		//Rotate the array 2 times and make the resultant array
		//{30, 40, 50, 60, 70, 80, 10, 20}
		
		int k = 3;
		for(int i = 0; i <  k; i++) {
			rotateArray(arr, 2);
		}
		
		printArray(arr);
	}
	
	//Function which rotates array by 1 position
	public static void rotateArray(int[] arr, int k) {
		int temp = arr[0];
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
			
		}
		arr[arr.length-1] = temp;

	}
	
	public static void printArray(int[] arr) {
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
	}
}
