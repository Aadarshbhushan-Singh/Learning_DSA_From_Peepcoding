package general_Practice;

public class Class_60_Longest_common_prefix {
	public static void main(String[] args) {
			String[] strs = {"flower","flow","flight"};
			String ans = longestCommonPrefix(strs);
			System.out.println(ans);
	}
	public static String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            boolean flag = true;
            for(int j = 1; j < strs.length; j++){
                if(i >= strs[j].length()){
                    flag = false;
                    break;
                }
                if(strs[j].charAt(i) != ch){
                       flag = false;
                }
            }
            
            if(flag == false){
                break;
            }else{
                ans = ans + ch;
            }
        }
        
        return ans;
    }
}
