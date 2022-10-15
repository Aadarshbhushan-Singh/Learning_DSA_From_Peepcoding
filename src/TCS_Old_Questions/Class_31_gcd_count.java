package TCS_Old_Questions;
import java.util.*;

public class Class_31_gcd_count {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
//		arr.add(1);
		arr.add(3);
		arr.add(6);
		arr.add(9);
		
		System.out.println(solve(arr));
	}
	static int solve(ArrayList<Integer> A) {
		for(int i = 0; i < A.size(); i++) {
			for(int j = i + 1; j < A.size(); j++) {
				if(gcd(A.get(i), A.get(j)) > 1) {
					continue;
				}else {
					return 0;
				}
			}
		}
		return 1;
	}
	
	static int gcd(int a, int b)
	{
	    int result = min(a, b); 
	    while (result > 0) {
	        if (a % result == 0 && b % result == 0) {
	            break;
	        }
	        result--;
	    }
	    return result; 
	}
	
	static int min(int a, int b) {
		if(a < b) {
			return a;
		}
		return b;
	}
}
