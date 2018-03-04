package interviewBit.heapandmaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedListSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeKLists(ArrayList<ListNode> a) {

		PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>(){
	        public int compare(ListNode l1, ListNode l2){
	            return l1.val - l2.val;
	        }
	    });
		
		a.stream().forEach( entry  -> {
			queue.add(entry);
		});
		ListNode head = new ListNode(0);
        ListNode p = head;
        while(queue.size() >  0){
            ListNode temp = queue.poll(); // removes the first / head from queue
            p.next = temp;
            if(temp.next != null)
                queue.add(temp.next);
            p = p.next;
        }
		return head.next;
	}

	class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

}
