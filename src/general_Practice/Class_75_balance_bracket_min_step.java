package general_Practice;
import java.util.*;

public class Class_75_balance_bracket_min_step {
	public static void main(String[] args) {
		String str = "{}{}}}";
	    int len = str.length();
	 
	    System.out.print(fun(str));
	}
	
	static int fun(String s){
		int len = s.length();
	    int oc = 0;
	    Stack<Character> st = new Stack<Character>();
	    int cc = 0;
	     
	    for(int i = 0; i < len; i++)
	    {	         
	       if (s.charAt(i) == '{')
	       {
	           if (cc > 0)
	           {	                
	               oc++;
	               st.pop();
	           }
	            
	           st.add(s.charAt(i));	            
	           cc = 0;
	       }
	       else if (st.isEmpty())
	       {
	           st.add('{');
	           oc++;
	            cc = 1;
	       }
	       else
	       {
	           cc = (cc + 1) % 2;
	           if (cc == 0)
	           {
	               st.pop();
	           }
	       }
	    }
	    oc += st.size() * 2 - cc;	 
	    return oc;
	}
}
