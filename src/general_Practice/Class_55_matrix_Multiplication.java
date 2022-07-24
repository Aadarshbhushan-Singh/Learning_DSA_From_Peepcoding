package general_Practice;

public class Class_55_matrix_Multiplication {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3},{3,4,5}, {5,6,7}};
		int[][] arr2 = {{3,2,5},{5,6,7},{8,9,0}};
		mutliply(arr1, arr2);
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	 public static void  mutliply(int[][] matrixA, int[][] matrixB)
	    {   
	        int[][] ans = new int[matrixA[0].length][matrixB.length];
	        
	        for(int i = 0; i < ans.length; i++){
	            for(int j = 0; j < ans[0].length; j++){
	                for(int k = 0; k < matrixA[0].length; k++){
	                    ans[i][j] = ans[i][j] + (matrixA[i][k] * matrixB[k][j]);
	                }
	            }
	        }
	        
	        for(int i = 0; i < ans.length; i++){
	            for(int j = 0; j < ans[0].length; j++){
	               matrixA[i][j] = ans[i][j];
	            }
	        }
	    }
}
