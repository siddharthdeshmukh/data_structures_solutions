package hackerrank.gs.java;

public class Solution {
    static String reverseSentence(String sentence) {
    		String reverse = "";
    		String[] wordArray = sentence.split(" ");
    		for(String words: wordArray){
    			
    			int index = 0;
    			char[] charArray = words.toCharArray();
    			int count = words.length();
    			while(index< count){
    				char temp = charArray[index];
    				charArray[index] = charArray[count-1];
    				charArray[count-1]= temp;
    				index++;
    				count--;
    			}
    			reverse = reverse + " " + String.valueOf(charArray);
    		}
    		return reverse.trim();
  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String reverse = reverseSentence("Hello World This is Siddharth");
      System.out.println(reverse);
	}

}
