package general_Practice;
import java.util.*;

public class Class_68_count_sum_pair {
	
	
	public static void main(String[] args) {
		int[] arr = {60018306, 799550914, 858427114, 81846509, 417128040};
		System.out.println(maxNumPair(arr.length, arr));
	}
	
	
	
    static int maxNumPair(int N, int[] arr){
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num: arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int maxPairCount = 0;
        for(int i = 0; i <= MAX_N * 2; i++){
            int curCount = 0;
            for(int j = 0; j <= i/2; j++){
                int k = i - j;
                int pairCount = Math.min(freqMap.getOrDefault(j, 0),  freqMap.getOrDefault(k, 0));
                if(j != k){
                   curCount +=  pairCount;
                }else {
                     curCount +=  pairCount / 2;
                }
            }
           maxPairCount = Math.max(curCount, maxPairCount);
        }
        
        return maxPairCount;
    }
    static private int MAX_N = 100;
}
