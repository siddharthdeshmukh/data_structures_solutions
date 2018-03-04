package interviewBit.Strings;

import java.util.regex.Pattern;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome("A man, a plan, a canal: Panama");

	}

	 public static int isPalindrome(String A) {
		 int retunrValue =1;
		 StringBuilder sb = new StringBuilder();
		 
		 A = A.toLowerCase();
		 
		 char[] charArray = A.toCharArray();
		 
		 for(char words:charArray){
			 if(Pattern.matches("[a-z0-9]",String.valueOf(words))){
				 sb.append(words);
			 }
		 }
		 A = sb.toString();
		 if(A.length()==0 || A.length()==1)
			 return 1;
		 for(int i=0, j=A.length()-1;i<A.length();i++,j--){
			 if(j<=i)
				 break;
			 if(A.charAt(i)!=A.charAt(j))
				 return 0;
		 }
		 
		return retunrValue;
	    }
}
