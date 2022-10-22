package TCS_Old_Questions;

public class Class_37_longest_increasing_subsequence {
	public static void main(String[] args) {
		 int arr[] = { 1,3,2 };
	        int n = arr.length;
	        System.out.println("Length of lis is " + lis(n, arr)
	                           + "\n");
	}
	
	 static int lis(int input1, int[] input2)
	    {
	        int array[] = new int[input1];
	        int i;
	        int j;
	        int max = 0;
	 
	        for (i = 0; i < input1; i++)
	            array[i] = 1;
	 
	        for (i = 1; i < input1; i++)
	            for (j = 0; j < i; j++)
	                if (input2[i] > input2[j] && array[i] < array[j] + 1)
	                    array[i] = array[j] + 1;
	 
	        for (i = 0; i < input1; i++)
	            if (max < array[i])
	                max = array[i];
	 
	        return max;
	    }
}
