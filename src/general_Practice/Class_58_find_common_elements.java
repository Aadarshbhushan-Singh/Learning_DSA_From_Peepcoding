package general_Practice;
import java.util.*;

public class Class_58_find_common_elements {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		Collections.addAll(arr1, 3, 4, 2, 2, 4);
		Collections.addAll(arr2, 3, 2, 2, 7);
		ArrayList<Integer> ans = common_element(arr1, arr2);
		System.out.println(ans);
	}
	
	public static ArrayList<Integer> common_element(ArrayList<Integer>v1, ArrayList<Integer>v2)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(Integer ele: v1){
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }else{
                map.put(ele, 1);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(Integer ele: v2){
            if(map.containsKey(ele)){
                if(map.get(ele) > 0){
                    ans.add(ele);
                    map.put(ele, map.get(ele)-1);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
