package general_Practice;
import java.util.*;

public class Class_51_count_pair_sum_hashmap {
	public static void main(String[] args) {
		int[] arr = {1,1,5,7};
		int k = 6;
		System.out.println(getPairsCount(arr, arr.length, k));
	}
	
	static int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(k - arr[i])){
                count = count + map.get(k-arr[i]);
            }
            
            if(k-arr[i] == arr[i]){
                count--;
            }
        }
        
        return count/2;
    }
}
