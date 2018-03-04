package interviewBit.Strings;

import java.util.ArrayList;

public class LongestPrefix {
	
	private static ArrayList<String> strArr = new ArrayList<>();
	
	public static void main(String[] args) {
		
		ArrayList<String> A = new ArrayList<>();
		A.add("abcd");
		A.add("abef");
		// TODO Auto-generated method stub
		System.out.println(longestCommonPrefix(A));

	}
	public static String longestCommonPrefix(ArrayList<String> A) {
		String s;
		if(A.size()==1)
			return A.get(0);
		strArr.clear();
        strArr.addAll(A);
		
		
		return partition(0, A.size()-1);
    }
	private static String partition(int s, int e)
    {
        if(s == e)
        {
            return strArr.get(s);
        }
        else
        {
            int l = (e - s);
            int m = l / 2;
            String left = partition(s, s + m);
            String right = partition(s + m + 1, e);
            return commonPrefix(left, right);
        }
    }

    /**
     * Longest common prefix
     * @param s1 String one
     * @param s2 String two
     * @return common prefix
     */
    private static String commonPrefix(String s1, String s2)
    {
        int sL = (s1.length() < s2.length()) ? s1.length() : s2.length();
        StringBuilder temp = new StringBuilder();
        for(int j = 0; j < sL; j++)
        {
            if(s1.charAt(j) == s2.charAt(j))
                temp.append(s1.charAt(j));
            else break;
        }
        return temp.toString();
    }
}
