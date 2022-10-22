package TCS_Old_Questions;

public class Class_01_rotate_array_using_temp_array {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
		//Rotate the array 2 times and make the resultant array
		//{30, 40, 50, 60, 70, 80, 10, 20}
		
		int k = 2;
		rotateArray(arr, 2);
	}
	
	public static void rotateArray(int[] arr, int k) {
		int[] tempArr = new int[k];
		
		//Putting element into temp array
		for(int i = 0; i < k; i++) {
			tempArr[i] = arr[i];
		}
		
		//Rotating element by 2 bits
		for(int i = 0; i < arr.length-k; i++) {
			arr[i] = arr[i+k];
		}
		
		//Combining temp array and arr 
		for(int i = arr.length-k, j = 0; i < arr.length; i++, j++) {
			arr[i] = tempArr[j];
		}
		
		printArray(arr);
		
	}
	
	public static void printArray(int[] arr) {
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
	}
	
	
}
