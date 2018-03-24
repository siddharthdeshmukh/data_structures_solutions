package interviewBit.linkedList;


public class ReverseLinkedListIterationSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ReverseLinkedListIterationSolution().new ListNode(1);
		ListNode secondNode = new ReverseLinkedListIterationSolution().new ListNode(2);
		head.next=secondNode;
		ListNode thirdNode = new ReverseLinkedListIterationSolution().new ListNode(3);
		secondNode.next=thirdNode;
		ListNode fourthNode = new ReverseLinkedListIterationSolution().new ListNode(4);
		thirdNode.next=fourthNode;
		ListNode fifthNode = new ReverseLinkedListIterationSolution().new ListNode(5);
		fourthNode.next=fifthNode;
		
		

	}

	public static  ListNode reverseList(ListNode A) {
		ListNode current, previous,next;
		
		current=A;
		previous=null;
		
		while(current!=null) {
			next =current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		A=previous;
		return A;
    }
	
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			this.val = x;
			next = null;
		}
	}
}
