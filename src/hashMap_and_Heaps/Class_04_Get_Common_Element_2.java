package hashMap_and_Heaps;
import java.util.*;

public class Class_04_Get_Common_Element_2 {
	public static void main(String[] args) {
		int[] arr1 = {1,1,2,2,2,3,5};
		int[] arr2 = {1,1,1,1,2,3,4};
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int ele: arr1) {
			if(hm.containsKey(ele)) {
				int freq = hm.get(ele);
				hm.put(ele, freq+1);
			}else {
				hm.put(ele, 1);
			}
		}
		
		for(int ele: arr2) {
			if(hm.containsKey(ele)) {
				if(hm.get(ele) > 0) {
					System.out.println(ele);
					int freq = hm.get(ele);
					hm.put(ele, freq-1);
				}
			}
		}
	}
}
