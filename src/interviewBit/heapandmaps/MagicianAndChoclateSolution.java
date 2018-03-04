package interviewBit.heapandmaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


public class MagicianAndChoclateSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> B = new ArrayList<>();
	B.add(6);
	B.add(5);
	nchoc(3, B);
	}
	
	public static int nchoc(int A, ArrayList<Integer> B) {
		int totalChoc =0;
		double div = Math.pow(10, 9) +7;
		if(B.size()==0)
			return 0;
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		B.stream().forEach(entry -> {
			queue.add(entry);
		});
		
		while(A>0) {
			int head = queue.peek();
			totalChoc = (int) ((totalChoc + (head%div))%div);
			queue.poll();
			queue.add(head/2);
			A--;
		}
		
		return totalChoc;
    }

}
