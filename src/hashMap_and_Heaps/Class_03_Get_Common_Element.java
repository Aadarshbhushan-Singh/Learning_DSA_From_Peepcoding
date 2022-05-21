package hashMap_and_Heaps;
import java.util.*;

public class Class_03_Get_Common_Element {
	public static void main(String[] args) {
		int[] arr1 = {1,1,2,2,2,3,5};
		int[] arr2 = {1,1,1,1,2,3,4};
		
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr1.length; i++) {
			int ele = arr1[i];
			if(hm.containsKey(ele)) {
				int freq = hm.get(ele);
				hm.put(ele, freq+1);
			}else {
				hm.put(ele, 1);
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			int ele = arr2[i];
			if(hm.containsKey(ele)) {
				System.out.println(ele);
				hm.remove(ele);
			}
		}
		
		
		
	}
}
