package collection_Interfaces_Practice;
import java.util.*;

public class Class_03_Stack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(98);
		st.push(66);
		st.push(76);
		
		System.out.println(st);
		
		int top = st.peek();
		System.out.println(top);
		
		int top2 = st.pop();
		System.out.println(top2);
		System.out.println(st);
		
		System.out.println("Get Method");
		System.out.println(st.get(1));
		
		System.out.println(st.indexOf(66));
		
		Iterator<Integer> itr = st.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
	
	static boolean checkBracker(String str) {
        Stack<Character> st = new Stack();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
                continue;
            }
            if (st.isEmpty()) return false;
            char check;
            switch (ch) {
                case ')':
                    check = (char) st.pop();
                    if (check == '{' || check == '[') return false;
                    break;
                case '}':
                    check = (char) st.pop();
                    if (check == '(' || check == '[') return false;
                    break;
                case ']':
                    check = (char) st.pop();
                    if (check == '(' || check == '{') return false;
                    break;
            }
        }
        return (st.isEmpty());
    }
}
