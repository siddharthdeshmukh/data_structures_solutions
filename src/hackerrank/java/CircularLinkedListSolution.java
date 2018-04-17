package hackerrank.java;

public class CircularLinkedListSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 class Node {
	        int data;
	        Node next;
	    }
	 
	 
	 boolean hasCycle(Node head) {
		 Node slow = head;
		 Node fast = head;
		 
		 while(slow !=null && slow.next!=null && fast!=null) {
			 slow = slow.next;
			 fast = fast.next.next;
			 
			 if(slow == fast) {
				 return true;
			 }
		 }
		 return false;
	 }

}
