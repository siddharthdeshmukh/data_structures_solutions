package interviewBit.linkedList;


public class MergeSortedLinkedListSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static ListNode mergeTwoLists(ListNode A, ListNode B) {
	  
		 if(A==null) {
			 return B;
			 
		 }
		 if(B==null) {
			 return A;
		 }
		 
		 ListNode tempHead = new MergeSortedLinkedListSolution().new ListNode(0);
		 ListNode newNode= tempHead;
		
		 while(A!=null && B!=null) {
			 if(A.val <=B.val) {
				 newNode.next=A;
				 A=A.next;
			 } else {
				 newNode.next=B;
				 B=B.next;
			 }
			 newNode = newNode.next;
			 
		 }
		 if(A!=null) {
			 newNode.next=A;
		 }
		 if(B!=null) {
			 newNode.next=B;
		 }
		 
		 return tempHead.next;
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
