package comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player>{
	
	@Override
	public int compare(Player p1, Player p2) {
		// TODO Auto-generated method stub
		if(p1.score == p2.score) {
			return p1.name.compareTo(p2.name);
		}else {
			if(p1.score>p2.score) {
				return 1;
			}else {
				return 0;
			}
		}
	
	}

}
