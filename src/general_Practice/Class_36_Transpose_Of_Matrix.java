package general_Practice;

public class Class_36_Transpose_Of_Matrix {
	public static void main(String[] args) {
		int[][] arr = {{1,1,1}, {2,2,2}, {3,3,3}};
		
		//Transpose
		//We have to run the loop only in upper triangle
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		//Display
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			
			System.out.println();
		}
	}
}
