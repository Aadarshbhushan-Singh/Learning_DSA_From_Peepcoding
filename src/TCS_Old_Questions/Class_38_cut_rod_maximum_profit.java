package TCS_Old_Questions;

public class Class_38_cut_rod_maximum_profit {
	public static void main(String[] args) {
		int arr[] = {0,2,1,7,3,5 };
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is "
                           + harry(size, arr));
	}
	
	 public static int harry(int input1, int[] input2)
	 {
		 	int[] arr = new int[input1-1];
		 	for(int i = 0; i < arr.length; i++) {
		 		arr[i] = input2[i+1];
		 	}
		 	input1 = input1-1;
	        int mat[][] = new int[input1 + 1][input1 + 1];
	        for (int i = 0; i <= input1; i++) {
	            for (int j = 0; j <= input1; j++) {
	                if (i == 0 || j == 0) {
	                    mat[i][j] = 0;
	                }
	                else {
	                    if (i == 1) {
	                        mat[i][j] = j * arr[i - 1];
	                    }
	                    else {
	                        if (i > j) {
	                            mat[i][j] = mat[i - 1][j];
	                        }
	                        else {
	                            mat[i][j] = Math.max(
	                                arr[i - 1]
	                                    + mat[i][j - i],
	                                mat[i - 1][j]);
	                        }
	                    }
	                }
	            }
	        }
	 
	        return mat[input1][input1];
	}
}
