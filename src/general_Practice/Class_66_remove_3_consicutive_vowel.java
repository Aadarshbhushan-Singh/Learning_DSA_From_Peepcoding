package general_Practice;

public class Class_66_remove_3_consicutive_vowel {
	public static void main(String[] args) {
		System.out.println(GoodString("aaabcdeee"));
		
	}
	public static String GoodString(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(i < s.length() -3) {
				if(isVowel(s.charAt(i)) == true && isVowel(s.charAt(i+1)) == true && isVowel(s.charAt(i)) == true) {
					int start = i;
					int end = i+1;
					while(isVowel(s.charAt(end)) == true) {
						end++;
					}
					String ss = s.substring(start, end);
					s = s.replace(ss, "");
					i = end;
				}
			}
			
		}
		return s;
	}
	
	static boolean isVowel(char c)
    {
        return (c == 'a') || (c == 'e') ||
               (c == 'i') || (c == 'o') ||
               (c == 'u');
    }
}

/*
 * public static String GoodString(String s) {
		
		System.out.println(s.replaceAll("(?i)([aeiou]{3})[aeiou]*","$1"));
		String ans = "";
		for(int n = s.length(); n >= 1; n--) {
			System.out.println(s.replaceAll("(?i)([aeiou]{"+n+"})[aeiou]*","$1"));
		}
		
		return ans;
	}
 * abcaeioz
 * 
 * */
