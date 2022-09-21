package TCS_Old_Questions;

public class Class_28_encrypt_character {
	public static void main(String[] args) {
		System.out.println(charEncrypt('h', 23));
		int[][] arr = {{100, 198, 333, 	323}, {122, 232, 252, 654}, {100, 20, 36, 25}};
		
		int[] ans = maxRevenue(arr);
		for(int ele: ans) {
			System.out.println(ele);
		}
	}
	
	public static char charEncrypt(char character, int key) {
		
		boolean capital = false;
		if(Character.isUpperCase(character) == true) {
			capital = true;
		}
		
		character = Character.toLowerCase(character);
		
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		int charNumber = character - 'a' + 1;
		int finalNum = (charNumber + key) % 26 - 1;
		
		
		if(capital == true) {
			return Character.toUpperCase(alphabet[finalNum]);
		}else {
			return alphabet[finalNum];
		}
		
		
		
	}
	
	public static int[] maxRevenue(int[][] salesRecord) {
		int[] ans = new int[salesRecord.length];
		
		for(int i = 0; i < salesRecord.length; i++) {
			ans[i] = findMax(salesRecord[i]);
		}
		
		return ans;
	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int ele: arr) {
			if(ele > max) {
				max = ele;
			}
		}
		
		return max;
	}
}
