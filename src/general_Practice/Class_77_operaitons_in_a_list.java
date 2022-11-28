package general_Practice;
import java.util.*;

public class Class_77_operaitons_in_a_list {
	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("ADD NEVER");
		str.add("ADD COLLAR");
		str.add("INSERT CAT COLLAR");
		str.add("REMOVE COLLAR");
		str.add("SHOW");
		str.add("hello");
		performOperation(str);
	}
	
	static void performOperation(List<String> str) {
		ArrayList<String> stk = new ArrayList<String>();
		int size = str.size();
		for(int i = 0; i <= size; i++) {
			String s = str.get(i);
			System.out.println(s);
			if(s.startsWith("SHOW")) {
				System.out.println("here");
				System.out.println(stk);
				break;
			}else if(s.startsWith("ADD ")) {
				String s1 = s.substring(4);
				System.out.println(s1);
				stk.add(s1);
			}else if(s.startsWith("INSERT ")) {
				String s1 = s.substring(7);
				String first = "";
				int a=0;
				while(s1.charAt(a) != ' ') {
					first = first + s1.charAt(a);
					a++;
				}
				
				String second = s1.substring(a);
				System.out.println(first + " " + second);
				int ind = stk.indexOf(second);
				stk.add(ind, first);
				
			}else if(s.startsWith("REMOVE ")) {
				String s1 = s.substring(7);
				System.out.println(s1);
				stk.remove(s1);
			}
		}
		
		System.out.println(stk.size());
	}
}
