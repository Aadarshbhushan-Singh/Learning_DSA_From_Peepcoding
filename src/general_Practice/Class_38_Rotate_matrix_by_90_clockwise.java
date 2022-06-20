package general_Practice;

public class Class_38_Rotate_matrix_by_90_clockwise {
	public static void main(String[] args) {
		int[][] arr = {{1,4,6}, {2,4,0}, {9,8,1}};
		
		displayMatrix(arr);
		
		//To rotate matrix my 90 degree in clockwise direction first we will transpose it and then swap the colums
		
		//Transpose
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr[0].length; j++) {
				swap(arr, i, j);
			}
		}
		
		System.out.println("After transpose: ");
		displayMatrix(arr);
		
		//Now swap the colums
		int x = arr.length - 1;
		int y = arr[0].length - 1;
		for(int i = 0, j = y; i < j; i++, j--) {
			for(int k = 0; k <= y; k++) {
				System.out.println(k+ " " + i + ":  " + k + " " + j);
				int temp = arr[k][i];
				arr[k][i] = arr[k][j];
				arr[k][j] = temp;
			}
		}
		
		System.out.println("Final matrix: ");
		displayMatrix(arr);
	}
	
	public static void displayMatrix(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void swap(int[][] arr, int x, int y) {
		int temp = arr[x][y];
		arr[x][y] = arr[y][x];
		arr[y][x] = temp;
	}
}
