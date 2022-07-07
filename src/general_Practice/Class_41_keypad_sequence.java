package general_Practice;

import java.io.*;
import java.util.*;

public class Class_41_keypad_sequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        ArrayList<String> ans = getKPC(str);
        System.out.println(ans);
    }

    static String[] arr = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> bcase = new ArrayList<>();
            bcase.add("");
            return bcase;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> ansRos = getKPC(ros);

        ArrayList<String> newAns = new ArrayList<>();
        
        String str2 = arr[ch - '0'];
        for(int i = 0; i < str2.length(); i++){
            char ch2 = str2.charAt(i);
            for(String ele: ansRos){
                newAns.add(ch2 + ele);
            }
        }

        return newAns;
    }

}
