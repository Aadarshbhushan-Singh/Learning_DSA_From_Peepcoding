package TCS_Old_Questions;
import java.util.*;

public class Class_27_find_bridge_point {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < n1; i++) {
			arr1[i] = scn.nextInt();
			if(arr.contains(arr1[i]) == false) {
				arr.add(arr1[i]);
			}
		}
		
		for(int i = 0; i < n2; i++) {
			arr2[i] = scn.nextInt();
			if(arr.contains(arr2[i]) == false) {
				arr.add(arr2[i]);
			}
		}
		
		
		int n = arr.size();
		Collections.sort(arr);
        System.out.println(arr);
		double m=0;
		if(n%2==1)
		{
			m=arr.get((n+1)/2-1);
		}
		else
		{	
			System.out.println(arr.get((n/2)-1));
			System.out.println(arr.get(n/2));
			m=((double)arr.get((n/2)-1) +(double)arr.get(n/2))/2;
		}
		
		System.out.println(m);
	}
}
