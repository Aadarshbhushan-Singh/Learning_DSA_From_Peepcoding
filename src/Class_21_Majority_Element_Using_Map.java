import java.util.*;

public class Class_21_Majority_Element_Using_Map {
	static int ele = -1;
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,3,3,4,3,3,3};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			int x = arr[i];
			if(map.containsKey(x)) {
				int y = map.get(x);
				y++;
				map.put(x, y);
			}else {
				map.put(x, 1);
			}
		}
		int n = arr.length/2;
		
		map.forEach((k, v)->{
			if(v > n) {
				ele = k;
			}
		});
		
		System.out.println(ele);
	}
}
