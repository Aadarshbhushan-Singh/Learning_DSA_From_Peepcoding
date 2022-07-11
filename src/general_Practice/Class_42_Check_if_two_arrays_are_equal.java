package general_Practice;
import java.util.*;

public class Class_42_Check_if_two_arrays_are_equal {
	public static void main(String[] args) {
		int[] A = {1,2,3,4};
		int[] B = {1,2,3,4,5};
		
		System.out.println(checkEqualArray(A, B));
	}
	
	public static boolean checkEqualArray(int[] A, int[] B) {
		Arrays.sort(A);
        Arrays.sort(B);
        if(A.length == B.length)
        {
            for(int i=0; i<A.length; i++)
            {
                if(A[i] != B[i])
                {
                    return false;
                }
            }
        }else {
        	return false;
        }
        return true;
	}
}
