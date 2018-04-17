package hackerrank.java;

import java.util.HashMap;
import java.util.Map;

public class RansomeNoteSolution {
	Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    String magzine;
    String note;
    
    public RansomeNoteSolution(String magzine,String note) {
    	this.magzine=magzine;
    	this.note=note;
    }
   
    public  boolean solve() {
        magazineMap= new HashMap<String, Integer>();
        String[] strInMag = magzine.split(" ");
        String[] strInNote = note.split(" ");
        for(String str:strInMag) {
        	if(magazineMap.containsKey(str)) {
        		magazineMap.put(str, magazineMap.get(str)+1);
        	}else {
        		magazineMap.put(str, 1);
        	}
        }
        for(String str:strInNote) {
        	if(magazineMap.containsKey(str) && magazineMap.get(str)!=0) {
        		magazineMap.put(str, magazineMap.get(str)-1);
        	}else {
        		return false;
        	}
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String magzine = "two times three is not four";
		String note = "two times two is four";
		RansomeNoteSolution rs = new RansomeNoteSolution(magzine, note);
		System.out.println(rs.solve());
	}

}
