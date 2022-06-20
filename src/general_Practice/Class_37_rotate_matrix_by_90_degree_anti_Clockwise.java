package general_Practice;

public class Class_37_rotate_matrix_by_90_degree_anti_Clockwise {
	public static void main(String[] args) {
		int[][] arr = {{1,4,6}, {2,4,0}, {9,8,1}};
		
		//For rotating the matrix by 90 degree anti-clockwise, we will first transpose the matrix and then interchange the row
		//Transpose of matrix
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//Swapping first row with last one and similarly second row with 3rd one to rotate anti-clockwise
		int x = arr.length-1;
		int y = arr[0].length-1;
		for(int i = 0, j = x; i < j; i++, j--) {
			for(int k = 0; k <= y; k++) {
				System.out.println(i+ " " + k + ":  " + j + " " + k);
				int temp = arr[i][k];
				arr[i][k] = arr[j][k];
				arr[j][k] = temp;
			}
		}
		
		System.out.println("After roatation: ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
