package hackerrank.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SolutionIpValidation {
	static String[] checkIPs(String[] ip_array) {
        String[] solutionArray = new String[ip_array.length];
         final String IPV4 = "IPv4";
         final String IPV6 = "IPv6";
         final String NONE = "Neither";
         int index =0;
         String ipV4Reg = "^(([01]?\\d\\d?|2[0-4]\\d?|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d?|25[0-5])$";
         String ipV6Reg = "^[0-9a-f]{1,4}:[0-9a-f]{1,4}:[0-9a-f]{1,4}:[0-9a-f]{1,4}:[0-9a-f]{1,4}:[0-9a-f]{1,4}:[0-9a-f]{1,4}:[0-9a-f]{1,4}$";
         Pattern pattern;
         Matcher match;
        for (String ip_string : ip_array) {
			
        	if(ip_string.indexOf('.')>0){
        		//Check for IpV4
        		pattern =Pattern.compile(ipV4Reg);
        		match = pattern.matcher(ip_string);
        		if(match.matches()){
        			solutionArray[index] =IPV4;
        		}else {
        			solutionArray[index] =NONE;
        			
        		}
        		index ++;
        	}else if(ip_string.indexOf(':')>0) {
        		pattern =Pattern.compile(ipV6Reg);
        		match = pattern.matcher(ip_string);
        		if(match.matches()){
        			solutionArray[index] =IPV6;
        		}else {
        			solutionArray[index] =NONE;
        			
        		}
        		index++;
        	}else {
        		solutionArray[index] =NONE;
        		index++;
        	}
		}
       
        return solutionArray;
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] num ={"Some Junk text", "192.168.0.7","2001:0db8:0000:0000:0000:ff00:0042:8329"};
		String[] cost = SolutionIpValidation.checkIPs(num);
		System.out.println(cost[0] + " " + cost[1] + " " + cost[2] );
		
   
	}

}
