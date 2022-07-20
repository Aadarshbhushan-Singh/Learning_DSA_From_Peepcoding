package general_Practice;
import java.util.*;

public class Class_52_count_triplets {
	public static void main(String[] args) {
		int[] arr = {0, -1, 2, -3, 1};
		System.out.println(findTriplets(arr, arr.length));
	}
	
	public static boolean findTriplets(int arr[] , int n)
    {
        for(int i = 0; i < arr.length; i++){
            
            HashSet<Integer> set = new HashSet<>();
            
            for(int j = i+1; j < arr.length; j++){
                
                if(set.contains(0-(arr[i] + arr[j]))){
                    return true;
                }else{
                    set.add(arr[j]);
                }
            }
            
        }
        
        return false;
    }
}
