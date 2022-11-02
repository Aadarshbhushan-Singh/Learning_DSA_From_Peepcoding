package TCS_Old_Questions;
import java.io.*;
import java.util.*;

public class Class_41_ceaser_cypher {
	public static void main(String[] args) {
		System.out.println(decrypt("phqgh"));
	}
	
	
	
	public static String decrypt(String ct) {
		int sk = 3;
	    ct = ct.toLowerCase();
	    String m = "";
	    for (int i = 0; i < ct.length(); i++) {
	      int charPosition = ALPHABET.indexOf(ct.charAt(i));
	      int kv = (charPosition + sk) % 26;
	      if (kv < 0) {
	        kv = ALPHABET.length() + kv;
	      }
	      char rv = ALPHABET.charAt(kv);
	      m += rv;
	    }
	    return m;
	  }
	
	
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
}
