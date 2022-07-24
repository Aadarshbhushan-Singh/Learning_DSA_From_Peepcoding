package general_Practice;

public class Class_56_wave_traversal_of_matrix {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3},{4,5,6}, {7,8,9}};
		
		for(int i = 0; i < arr1[0].length; i++) {
			if(i%2 == 0) {
				for(int j = 0; j < arr1.length; j++) {
					System.out.print(arr1[j][i]+ " ");
				}
			}else {
				for(int j = arr1.length-1; j>= 0; j--) {
					System.out.print(arr1[j][i] + " ");
				}
			}
		}
		
	}
}
