package interviewBit.Strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseWords(" is this  world ");

	}
	
	public static String reverseWords(String a) {
		StringBuilder sb = new StringBuilder() ;
		String[] stringArray = a.split(" ");
		/*for(String word:  stringArray){
			System.out.println(word);
		}*/
		for(int i=stringArray.length-1;i>=0;i--){
			if(stringArray[i].equals("")){
				continue;
			}
			sb.append(stringArray[i]);
			
			if(i!=0){
				sb.append(" ");
			}
		}
		String s = sb.toString();
		System.out.println(s.trim().toString());
		return s.trim().toString();
	}

}
