package hackerrank.java;

import java.util.HashMap;

public class MakingAnagramsSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int numberNeeded(String first, String second) {
		int count =0;
		int length =0;
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		for(int i=0;i<first.length();i++) {
			char ch = first.charAt(i);
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)  +1);
			}else {
				charMap.put(ch, 1);
			}
		}
		
		char[] charInSecondString = second.toCharArray();
		
		for(char ch : charInSecondString) {
			if(charMap.containsKey(ch) && charMap.get(ch)!=0) {
				charMap.put(ch, charMap.get(ch)-1);
				length=length+2;
			}
		}
		count = first.length()+ second.length() - length;
		return count;
    }

}
