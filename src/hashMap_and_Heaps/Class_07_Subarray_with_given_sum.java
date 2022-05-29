package hashMap_and_Heaps;
import java.util.*;

public class Class_07_Subarray_with_given_sum {
	public static void main(String[] args) {
		int[] arr = {1,2,3,7,5};
		int target = 12;
		int n = arr.length;
		
		ArrayList<Integer> ans = subarraySum(arr, n, target);
		
		for(int ele: ans) {
			System.out.print(ele + " ");
		}
		
	}
	
	public static ArrayList<Integer> subarraySum(int[] arr, int n, int target) 
    {
		//If sum of subraray from 0-3 is k and 0-7 is target-k, then from 3+1 to7, it should be target
        int sum = 0;

        //Store sum and the index till which the array forms that particular sum
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,0);
        
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
            int remSum = sum - target;
            if(map.containsKey(remSum)){
                int val = map.get(remSum);
                ans.add(val+1);
                ans.add(i+1);
                break;
            }else{
                map.put(sum, i+1);
            }
        }
        
        
        if(ans.size() == 0){
            ans.add(-1);
        }
        
        return ans;
    }
}
