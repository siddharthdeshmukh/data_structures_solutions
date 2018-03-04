package interviewBit.Strings;

import java.security.acl.LastOwnerException;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(lengthOfLastWord("     "));

	}

	    // DO NOT MODIFY THE LIST. IT IS READ ONLY
	    public static int lengthOfLastWord(final String A) {
	    	
	    	String[] stringArray = A.split(" ");
	    	if(stringArray.length==0){
	    		return 0;
	    	}
	    	String lastWord = stringArray[stringArray.length -1];
	    	char[] charArray = lastWord.toCharArray();
	    	
	    	
	    	return charArray.length;
	    }
}
