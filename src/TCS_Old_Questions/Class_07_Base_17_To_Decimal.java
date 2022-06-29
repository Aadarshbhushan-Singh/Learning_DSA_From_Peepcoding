package TCS_Old_Questions;
import java.util.*;

/*
 * Convert the given base 17 number into decimal
 * */

public class Class_07_Base_17_To_Decimal {
	public static void main(String[] args) {
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		hmap.put('A',10);
		hmap.put('B',11);
		hmap.put('C',12);
		hmap.put('D',13);
		hmap.put('E',14);
		hmap.put('F',15);
		hmap.put('G',16);
		hmap.put('a',10);
		hmap.put('b',11);
		hmap.put('c',12);
		hmap.put('d',13);
		hmap.put('e',14);
		hmap.put('f',15);
		hmap.put('g',16);
		
		ArrayList<Integer> arr = new ArrayList<>();
		String inputString = "23GF";
		
		//Fill the numerical value of string from right to left in array list
		for(int i = inputString.length()-1; i >= 0; i--) {
			
			char c = inputString.charAt(i);
			if(c >= 'A' && c <= 'Z' || c >= 'a' && c <='z') {
				arr.add(hmap.get(c));
			}else {
				String cVal = String.valueOf(c);
				int cValInt = Integer.parseInt(cVal);
				arr.add(cValInt);
			}
		}
		int k = 0;
		int ans = 0;
		
		//Multiply the value with the power of 17 and add it to the number
		for(int ele: arr) {
			ans = (ans + ele * (int)Math.pow(17, k));
			k=k+1;
		}
		
		System.out.println(arr);
		System.out.println(ans);
	}
}
