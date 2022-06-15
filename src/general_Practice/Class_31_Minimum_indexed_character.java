package general_Practice;
import java.util.*;

public class Class_31_Minimum_indexed_character {
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		String patt = "set";
		
//		Explanation: e is the character which is
//		present in given str "geeksforgeeks"
//		and is also presen in patt "set". Minimum
//		index of e is 1.
		
		System.out.println(minIndexChar(str, patt));
		System.out.println(minIndexChar2(str, patt));
		
	}
	
	//Conventional Approach
	 public static int minIndexChar(String str, String patt)
	    {
	        for(int i = 0; i < str.length(); i++){
	            char ele = str.charAt(i);
	            boolean found = search(ele, patt);
	            if(found == true){
	                return i;
	            }
	        }
	        
	        return -1;
	    }
	    
	    public static boolean search(char ele, String patt){
	        for(int i = 0; i < patt.length(); i++){
	            char c = patt.charAt(i);
	            if(c == ele){
	                return true;
	            }
	        }
	        
	        return false;
	    }
	    
	  //Using a collection
	    
	  public static int minIndexChar2(String str, String patt) {
		  HashSet<Character> set1 = new HashSet<>();
		  for(int i = 0; i < patt.length(); i++) {
			  char ele = patt.charAt(i);
			  set1.add(ele);
		  }
		  
		  for(int i = 0; i < str.length(); i++) {
			  char ele = str.charAt(i);
			  if(set1.contains(ele)) {
				  return i;
			  }
		  }
		  
		  return -1;
	  }

}
