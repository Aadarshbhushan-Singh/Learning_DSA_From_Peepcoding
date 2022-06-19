package general_Practice;
import java.util.*;

public class Class_35_Finding_Unique_Element {
	public static void main(String[] args) {
		//Given two strings A and B. Find the characters that are not common in the two strings. 
		String A = "geeksforgeeks";
		String B = "geeksquiz";
		
		String ans = "";
        HashSet<Character> setA = new HashSet<>();
        for(int i = 0; i < A.length(); i++){
            char ele = A.charAt(i);
            setA.add(ele);
        }
        
        HashSet<Character> setB = new HashSet<>();
        for(int i = 0; i < B.length(); i++){
            char ele = B.charAt(i);
            setB.add(ele);
        }
        
        for(int i = 0; i < A.length(); i++){
            char ele = A.charAt(i);
            if(setB.contains(ele) == false){
                ans+=ele;
            }
        }
        
        for(int i = 0; i < B.length(); i++){
            char ele = B.charAt(i);
            if(setA.contains(ele) == false){
                ans+=ele;
            }
        }
        
       
        
        HashSet<Character> set1  = new HashSet<Character>();
        for(int i = 0; i < ans.length(); i++){
            char ele = ans.charAt(i);
            set1.add(ele);
        }
        
        
        String finalAns = "";
        for(char ele: set1){
            finalAns+=ele;
        }
        
         char[] tempArr = finalAns.toCharArray();
        
        Arrays.sort(tempArr);
        
        String newAns = new String(tempArr);
        
        if(ans.length() == 0){
            System.out.println("-1");
        }
        
        System.out.println(newAns);
	}
}
